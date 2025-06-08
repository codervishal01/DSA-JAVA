
public class palindrome {
    public static void palindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println("Not a palindrome");
                return;
            }
            start++;
            end--;
        }

        System.out.println("This string is a palindrome");
    }

    public static void main(String[] args) {
        String str = "non";
        palindrome(str);
    }
}
