function bubbleSort(arr){
    let n = arr.length //Number of elements in array
    for (let i=0; i < n-1; i++){
        //Number of passes which is n -1
        let swapped = false; 
        for (let j = 0; j < n-i-1;  j++){
            //The limit of j should be the second to last element in the array
            console.log(`\nComparing ${arr[j]} and ${arr[j+1]}`)
            if (arr[j] > arr[j+1]){
                swapped = true;
                //Left is greater than right
                console.log(`${arr[j]} is greater`)
                let temp = arr[j];
                console.log("Temp",temp)
                console.log("Lesser", arr[j+1])
                arr[j] = arr[j+1];
                console.log("Left now", arr[j])
                arr[j+1] = temp;
                console.log("Right now", arr[j+1])
            }
        }

        if(!swapped){
            //Check if a swap took place in a pass, if now swap took place, the array is already sorted
            break;
        }

        console.log(`\nArray after pass ${i}: ${arr}`)
    }

    return arr
}

let myArr = [5,4,3,2,1]
console.log(`Before sort: ${myArr}`)
let sortedArr = bubbleSort(myArr);

console.log(`After sort: ${sortedArr}`)