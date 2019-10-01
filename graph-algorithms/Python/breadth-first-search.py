from collections import deque
#Finds the shortest path to a person who's name ends with "m"

graph = {}
graph["you"] = ["emeka", "mike", "mary"]
graph["emeka"] = ["alex", "chioma"]
graph["mike"] = ["dan", "john", "lahm"]
graph["mary"] = ["anna", "sam"]
graph["alex"] = []
graph["chioma"] = []
graph["dan"] = []
graph["john"] = []
graph["anna"] = []
graph["sam"] = []


def search(name):
    search_queue = deque()
    search_queue+=graph[name]
    searched = []
    while search_queue:
        person = search_queue.popleft()
        if(person not in searched):
            if(person[-1] == "m"):
                print(person + " is a mango seller")
                return True
            else:
                searched.append(person)
                search_queue += graph[person]
    return False

search("you")