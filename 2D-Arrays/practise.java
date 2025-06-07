
// public class practise {

//     public static void countSeven(int arr[][]){
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                 if(arr[i][j]==7){
//                     count++;
//                 }
//             }
//         }
//         System.out.print(count);
//     }
//     public static void main(String args[]) {
//         int arr[][] = {
//                         { 4, 7, 8 },
//                         { 8, 8, 7 } };
//             countSeven(arr);
//     }

// }

public class practise {
    public static void calSum(int nums[][]){
        int sum=0;
        for(int j=0;j<nums[0].length;j++){
            sum+=nums[1][j];
        }
        System.out.print(sum);
    }

    public static void main(String args[]){
         int nums[][] = { 
                        {1,4,9},
                        {11,4,3},
                        {2,2,3} 
                    };
                    calSum(nums);
    }
}