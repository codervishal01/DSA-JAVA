public class bubbleSort {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int turns = 0; turns < n; turns++) {
            for (int j = turns; j < n - 1 - turns; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 1, 8, 4, 3 };
        bubbleSort(arr);
        System.out.print("Sorted Array: ");
        printArr(arr);
        System.out.println();

    }
}