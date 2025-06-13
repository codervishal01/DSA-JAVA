import java.util.Scanner;

public class ithBit {

    public static int ithBit(int ith, int num) {
        int bitMask = 1 << ith;
        if ((bitMask & num) == 0) {
            System.out.print("ith element is 0.");
        } else {
            System.out.print("ith element is 1.");
        }
        return 1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ith = sc.nextInt();
        int num = sc.nextInt();
        ithBit(ith, num);

    }
}
