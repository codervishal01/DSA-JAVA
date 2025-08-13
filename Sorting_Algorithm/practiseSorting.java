
// Question :Use the following sorting algorithms tosort an array 
// in DESCENDING order :
// a.Bubble Sort
// b.Selection Sort
// c.Insertion  Sort
// d.Counting Sort
// You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]
public class practiseSorting {

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int prev=i-1;
            int curr=arr[i];

            while(prev>=0 && arr[prev]>curr){
                
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // bubbleSort(arr);
        insertionSort(arr);
        printArr(arr);
    }
}