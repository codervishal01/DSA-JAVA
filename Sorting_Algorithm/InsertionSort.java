package Sorting_Algorithm;

public class InsertionSort {

    public static void insertionSorting(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the current element at its correct position
            arr[j + 1] = current;
        }
    }

    //  print the array
    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int arr[] = {9, 5, 1, 4, 3};
    
        insertionSorting(arr);
        System.out.println("After sorting:");
        printArray(arr);
    }
}
