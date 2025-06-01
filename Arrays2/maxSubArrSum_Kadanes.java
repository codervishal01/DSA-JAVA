public class maxSubArrSum_Kadanes {

    public static int kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0;i<numbers.length;i++){
            cs =cs + numbers[i];
            if (cs< 0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        return ms;
    }

    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArraySum(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
