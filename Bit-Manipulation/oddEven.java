import java.util.Scanner;

public class oddEven{
    public static boolean oddEven(int n){
        int bitMask=1;
        if ((n& bitMask) == 0) {
            System.out.print("even");
            return true;
        } else {
            System.out.print("odd");
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        oddEven(n);
    }
}