function mergeSort(arr, count){
    let n = arr.length;
    if (n < 2){
        return arr;
    }

    let middle = n/2; //Get the middle index

    //Split the array into two halves - left and right
    let leftArr = arr.slice(0, middle);
    let rightArr = arr.slice(middle, n);

    console.log(`Left arr after split ${count}: ${leftArr}`)
    console.log(`Right arr after split ${count}: ${rightArr} \n`)

    count++

    //Recursively call mergeSort until the array cannot be subdivided further, then merge
    return merge(mergeSort(leftArr, count), mergeSort(rightArr, count))
}

function merge(leftArr, rightArr){
    let result = []
    let leftIndex = 0;
    let rightIndex = 0;

    while (leftIndex < leftArr.length && rightIndex < rightArr.length){
        if(leftArr[leftIndex] < rightArr[rightIndex]){
            result.push(leftArr[leftIndex])
            leftIndex++
        } else {
            result.push(rightArr[rightIndex])
            rightIndex++
        }

    }

    while(leftIndex < leftArr.length){
        result.push(leftArr[leftIndex])
        leftIndex++
    }

    while(rightIndex < rightArr.length){
        result.push(rightArr[rightIndex])
        rightIndex++
    }

    return result;
}

let arr = [6,5,4,3,2,1];
console.log(`Array before sorting: ${arr}`)
// console.time("start")
let sortedArr = mergeSort(arr, 1)
// console.timeEnd("start")
console.log(`Array after sorting: ${sortedArr}`)