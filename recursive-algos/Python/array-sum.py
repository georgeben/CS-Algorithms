def sum(arr):
    if(len(arr) < 1):
        return 0
    return arr.pop() + sum(arr)

def sum2(arr):
    if(len(arr) == 1):
        return arr[0]
    return arr.pop() + sum2(arr)

def test():
    assert(sum([1,2,3]) == 6)
    print("All tests passed")

arr1 = [1,2,3,1,7]
arr2 = [4,3,2,1]

print(sum(arr1))
print(sum2(arr2))

test()