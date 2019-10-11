public class QuickSort{
    static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        System.out.println("Pivot is "+ pivot);
        int i = low -1;
        System.out.println("At first, i is "+ i);
        for (int j=low; j<high; j++){
            System.out.println("Comparing "+ arr[j] + " and "+ pivot);
            if(arr[j] < pivot){
                System.out.println(arr[j] + " is lesser than "+pivot);
                i+=1;
                System.out.println("After incrementing, i is " +i);
                int temp = arr[i];
                System.out.println("Swapping "+arr[i] + " with "+arr[j]);
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        System.out.println("Temp is "+temp);
        System.out.println("arr[high] is "+arr[high] + "\n");
        arr[i+1] = arr[high];
        arr[high] = temp;

        return (i+1);
    }

    static void sort(int arr[], int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);
            sort(arr, low, pivotIndex -1);
            sort(arr, pivotIndex+1, high);
        }
    }

    static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {1,4,5,2,3};
        // System.out.print("Before ");
        // printArr(arr);
        // partition(arr, 0, arr.length-1);
        // printArr(arr);
        sort(arr, 0, arr.length-1);
        printArr(arr);
    }
}