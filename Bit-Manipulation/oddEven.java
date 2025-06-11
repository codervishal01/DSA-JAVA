import java.util.Scanner;

public class oddEven{
    public static boolean oddEven(int num){
        int bitMask=1;
        if ((num & bitMask) == 0) {
            System.out.print("even");
            return true;
        } else {
            System.out.print("odd");
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        oddEven(num);
    }
}