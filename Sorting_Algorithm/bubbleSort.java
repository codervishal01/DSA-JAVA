public class bubbleSort {

    public static void bubbleSorting(int nums[]) {
        int n = nums.length;
        for (int turns = 0; turns < n - 1; turns++) {
            for (int j = 0; j < n - 1 - turns ; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void printnums(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String args[]) {
        int nums[] = { 5, 3, 8, 4, 2 };
        bubbleSorting(nums);
        printnums(nums);
    }
}
 