def find_smallest(arr):
    smallest_index = 0
    smallest_item = arr[smallest_index]

    for i in range(1, len(arr)):
        if (arr[i] < smallest_item):
            smallest_index = i
            smallest_item = arr[smallest_index]
    return smallest_index

def selection_sort(arr):
    sorted_arr = []
    for i in range(len(arr)):
        smallest = find_smallest(arr)
        sorted_arr.append(arr.pop(smallest))
    return sorted_arr


my_arr = [10,3,2,5,6,1]
sorted_arr = selection_sort(my_arr)

print(sorted_arr)
