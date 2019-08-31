function selectionSort(arr){
    let n = arr.length; //The number of elements in array
    for(let i = 0; i < n-1; i++){
        //i is the number of passes
        console.log(`Pass ${i}`)
        console.log(`Index of unsorted array ${i}`)
        let minIndex = i; //Assume the index of the minimum element be the 0 (The first element is the minimum)
        for (let j = i+1; j < n; j++){
            console.log(`Next index to check: ${j}`)
            console.log(`Minimum index ${minIndex}`)
            if (arr[j] < arr[minIndex]){
                console.log(`New minimum element: ${arr[j]} at index ${j}`)
                //Let the minIndex be j since the element at j is less than minIndex
                minIndex = j;
            }

            console.log(`Before swap ${arr}`)

            //Swap the items to their appropriate position
            let temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp

            console.log(`After swap ${arr} \n`)
        }
    }

    return arr
}

let arr = [6,5,4,3,2,1]
console.log(`Before sorting: ${arr}`)
// console.time("start")
let sortedArr = selectionSort(arr);
// console.timeEnd("start")
console.log(`After sorting: ${sortedArr}`)
