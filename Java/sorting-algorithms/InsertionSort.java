public class InsertionSort {
    public static void sort(int[] arr){
        int arrLength = arr.length;

        for(int i = 1; i < arrLength; i++){
            /**Start the iteration from the second element */
            int current = arr[i]; //Current stores the initial value of i
            int j = i-1;

            /**
            System.out.println("i ->"+ i);
            System.out.println("j ->"+ j);
            */

            /** 
            System.out.print("Array before shifting");
            printArr(arr);
            */

            /* Shift the arr[0 - i-1] elements one step to the right */
            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = current;
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