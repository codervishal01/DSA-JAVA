public class BinarySearch {

    // Binary search
    public static int binarySearch(int numbers[],int key){
        int start =0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start + end) /2;
            
            if(numbers[mid]==key){
                return mid;
            } else if(numbers[mid]<key){
                start = mid+1;
            } else{
                end = mid-1;
            }
         } 
         return -1;//not found
    }

    public static void main(String args[]){
        int numbers[] = {2,6,8,10,12,14};
        int key = 14;
        int index = binarySearch(numbers, key);
        if(index==-1){
            System.out.println("Key not found!");
        }else{
            System.out.println("Key is found at index : " + index);
        }
        
    }
}
