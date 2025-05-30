public class LargestNum {

    // Function to find the largest number in an array
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; 
        int smallest = Integer.MAX_VALUE; 
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i] ;
            }
        }
        System.out.println("Smallest number is : " + smallest);
        return largest;
    }

    public static void main(String args[]){
        int numbers[] = {23, 43, 234, 45, 67, 89, 90, 12, 34};
        int largest = getLargest(numbers);
        System.out.println("Largest number in the array is: " + largest);
    }
}
