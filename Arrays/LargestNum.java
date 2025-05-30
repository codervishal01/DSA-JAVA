public class LargestNum {

    // Function to find the largest number in an array
    public static int findLargest(int numbers[], int num){
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > num){
                num = numbers[i];
            }
            
        }
        return num;
    }

    public static void main(String args[]){
        int numbers[] = {23, 43, 234, 45, 67, 89, 90, 12, 34};
        int largest = findLargest(numbers,0);
        System.out.println("Largest number in the array is: " + largest);
    }
}
