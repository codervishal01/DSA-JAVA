public class Reverse {
    public static void reverse(int numbers[]){
        int first=0,last=numbers.length-1;

        while(first<last){
            int temp= numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,6,8,10,12,14};
        reverse(numbers);
        System.out.print("Reversed array: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
