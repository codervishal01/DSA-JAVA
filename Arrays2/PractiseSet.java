public class PractiseSet {
    // //Question 1:Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    // //Example 1:Input:nums = [1, 2, 3, 1]Output:   true
    // public static boolean containsDuplicate(int nums[]){
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i] == nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    // public static void main(String args[]) {
    //     int nums[] = {1, 2, 3, 1};
    //     System.out.println("Contains Duplicate: " + containsDuplicate(nums));
    // }


// Question 2:There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  
// such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        
// pivot        index 3   and become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   
// if it is not in nums.You must write an algorithm with O(log n) runtime complexity.Example 1:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 0 Output:   4 Example 2:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 3Output:   -1
    public static int search(int nums[], int target){
        int n=nums.length;
        int pivot = 3;
        int pivotArr[] = new int[n];
        for(int i=pivot;i<n;i++){
            pivotArr[i-pivot] = nums[i];
        }

        for(int i=0;i<pivot;i++){
            pivotArr[n-pivot+i] = nums[i];
        }
        for(int i=0;i<n;i++){
            if(pivotArr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int result = search(nums, target);
        System.out.print(result);
        
    }
}
