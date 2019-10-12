public class BubbleSort{
    static void sort(int arr[]){
        int size = arr.length;
        for(int i=0; i < size-1; i++){
            //Maximum number of passes is n-1;
            Boolean swapped = false;
            for(int j=0; j < size-1-i; j++){
                if(arr[j] > arr[j+1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            if(!swapped){
                break; //No need to go to the next pass
            }
        }
    }

    static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {4,3,2,1};
        sort(arr);
        printArr(arr);
    }
}