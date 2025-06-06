package Sorting_Algorithm;

import java.util.*;

public class inbuiltSorting {
    public static void main(String args[]) {
        Integer arr[] = {3, 2, 4, 1, 7,1, 6}; // Use Integer instead of int
        Arrays.sort(arr);  
        Arrays.sort(arr,0,3);  
        Arrays.sort(arr, Collections.reverseOrder());  
        System.out.println(Arrays.toString(arr));
    }
}
