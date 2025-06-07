public class diagonalSum {

    public static void printDiagonalSum(int matrix[][]){
        int sum =0;
       // TC= BigOF(n*2)
       
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;i<matrix[0].length;j++){
    //             if(i==j){
    //          sum += matrix[i][j];
    //         }
    //         else if(i+j==matrix.length-1){
    //              sum += matrix[i][j];
    //         }
    //         }
    //     }
    // }
    
    //optimized version TC= BigOF(n)
    for(int i=0;i<matrix.length;i++){
        sum+=matrix[i][i];
        if(i != matrix.length-i-1){
            sum+=matrix[i][matrix.length-i-1];
            }
        }
        System.out.println("Diagonal sum: " + sum);
    }

  public static void main(String args[]){
    int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
            };
            printDiagonalSum(matrix);
  }
  
}
