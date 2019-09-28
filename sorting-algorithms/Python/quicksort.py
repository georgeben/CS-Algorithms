def quicksort(arr):
    if(len(arr) <= 1):
        return arr
    pivot = arr[0]
    less = [i for i in arr[1:] if(i < pivot)] #sub array of elements less than the pivot
    greater = [i for i in arr[1:] if(i > pivot)]  #sub array of elements greater than the pivot

    return quicksort(less) + [pivot] + quicksort(greater)

def test():
    assert(quicksort([3,2,1]) == [1,2,3])
    print("All tests passed")

arr = [4,6,3,2,1]
sorted_arr = quicksort(arr)
print(sorted_arr) 

test()