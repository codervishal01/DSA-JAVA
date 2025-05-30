import java.util.*;

public class LinearSearch {

    //Linear search 
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[]= {23,43,234,45,67,89,90,12,34};
        int key=45;
        int index= linearSearch(numbers,key);
        if(index != -1){
            System.out.println("Key " + key + " is found at index: " + index);
        }else{
            System.out.println("Key not found !");
        }
    }
}

