public class SelectionSort{
    static void sort(int arr[]){

        //Get the length of the array
        int arrLength = arr.length;

        for(int i=0; i<arrLength; i++){
            /* i is the starting point of the unsorted array, at first, the whole
            array is unsorted, so it is at index 0*/

            //The minimumElement is the first element in the unsorted array
            int minIndex = i;

            /* Get the next element in the unsorted arr, and check if it is smaller
            than the current minElement, if it is swap it with the minElement  */
            int j = i+1;
            while(j < arrLength){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                j+=1;
            }
        }
    }

    static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {4,5,3,2,1};
        sort(arr);

        printArr(arr);
    }
}