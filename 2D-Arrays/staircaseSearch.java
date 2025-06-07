
public class staircaseSearch {

    public static boolean staircaseSearch(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("key is found at "+row+","+col);
                return true;
            }
            if(matrix[row][col]>key){
                col--;
            }else{
                row++;
            }
        }
        System.out.print("key not foundin matrix");
        return false;
    }
        
    public static void main(String args[]){
    int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 40 },
                { 32, 33, 39, 50 }
            };
      int key=33;
      staircaseSearch(matrix, key);
  }
}
