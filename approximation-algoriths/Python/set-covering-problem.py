states_needed = set(["bayelsa", "rivers", "lagos", "abuja", "benin", "delta", "calabar", "kano"])
stations = {}
stations["coolfm"] = set(["abuja", "benin", "delta"])
stations["wazobiafm"] = set(["rivers", "abuja", "bayelsa"])
stations["rythmfm"] = set(["lagos", "benin", "calabar"])
stations["gloryfm"] = set(["benin", "delta"])
stations["royalfm"] = set(["calabar", "kano"])

chosen_stations = set()

while states_needed:
    states_covered = set()
    best_station = None
    for station, states_for_station in stations.items():
        covered = states_needed & states_for_station
        print("States needed: ", states_needed)
        print(station +" covers", covered)
        print("States already covered", states_covered, "\n")
        if(len(covered) > len(states_covered)):
            best_station = station
            states_covered = covered
        print("Best station", best_station)
    chosen_stations.add(best_station)
    states_needed -= states_covered

print("Stations selected", chosen_stations)
