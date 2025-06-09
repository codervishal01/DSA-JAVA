
public class largestStringFinder {
    
    public static void printLargestString(String[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return;
        }

        String largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(largest) > 0) {
                largest = arr[i];
            }
        }

        System.out.println("Largest string: " + largest);
    }

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "zebra", "mango", "grape"};
        printLargestString(strings);
    }
}
