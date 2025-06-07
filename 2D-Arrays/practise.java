
//  public class practise {

// // Question 1 : Print the number of 7’s that are in the 2d array.
// // Example :
// // Input - int[][] array = { {4,7,8},{8,8,7} };


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
//     Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
// Example :
// Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };

    public static void calSum(int nums[][]) {
        int sum = 0;
        for (int j = 0; j < nums[0].length; j++) {
            sum += nums[1][j];
        }
        System.out.print(sum);
    }

// Question 3 : Write a program to Find Transpose of a Matrix.
// What is Transpose?
// Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
// Matrix
// a11 a12 a13
// a21 a22 a23
// Transposed Matrix
// a11 a21
// a12 a22
// a13 a23


    public static void transposeMatrix(int nums[][]) {

        int matrix[][] = new int[3][3];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (i == j) {
                    matrix[i][j] = nums[i][j];

                } else {
                    matrix[i][j] = nums[j][i];
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int nums[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };
        transposeMatrix(nums);
    }
}