public class toUpperCase {
    //Covert charcter of each first word to uppercase

    public static String toUpperCase(String str){
        StringBuilder sb= new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(ch);
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str ="hi, i am vishal";
        System.out.print(toUpperCase(str));
    }
}
