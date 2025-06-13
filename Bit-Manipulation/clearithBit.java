import java.util.Scanner;

public class clearithBit {

    public static int clearithBit(int ith, int num) {
        int bitMask = ~(1 << ith);
        return num & bitMask;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ith = sc.nextInt();
        int num = sc.nextInt();
        System.out.print(clearithBit(ith, num));
    }
}
