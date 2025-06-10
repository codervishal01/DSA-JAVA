import java.util.*;

// Question1:CounthowmanytimeslowercasevowelsoccurredinaStringenteredbytheuser
public class vowelString {
    public static int getVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("vowels are " + getVowels(str));
    }
}
