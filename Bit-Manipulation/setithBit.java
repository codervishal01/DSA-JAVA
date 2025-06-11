import java.util.Scanner;

public class setithBit {
    public static int setithBit(int ith, int num) {
        int bitMask = 1 << ith;
        return num | bitMask;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ith = sc.nextInt();
        int num = sc.nextInt();
        System.out.print(setithBit(ith, num));
    }
}
