def max(arr):
    if (len(arr) == 1):
        return arr[0]
    else:
        a = arr.pop()
        b = max(arr)
        if(a > b):
            return a
        return b

def test():
    assert(max([3,15,2,4]) == 15)
    print("All tests passed")

arr = [1,100,9,2,20,3,7]
print(max(arr))

test()