public class substring {

    public static String subString(String str, int si, int ei) {
        // for(int i=0;i<str.length();i++){
        // for(int j=0;j<str.length();j++){
        // for(int k=i;k<=j;k++){
        // System.out.print(str.charAt(k));
        // }
        // System.out.println();
        // }

        // }
        // }
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);

        }
        return substr;
    }

    // System.out.print(str.substring(0,5));
}
