import java.util.Scanner;

public class updateithBit {
    public static int updateBit(int ith , int nums ,int newBit){
        // Clear the ith bit
        int bitMask = ~(1 << ith);
        nums = nums & bitMask;
        // Set the ith bit to newBit
        bitMask = newBit << ith;
        return nums | bitMask;
    }
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int ith = sc.nextInt();
            int nums = sc.nextInt();
            int newBit= sc.nextInt();
            System.out.print(updateBit(ith,nums,newBit));
        }
}
