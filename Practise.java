class Practise {
    public int majorityElement(int[] nums,int key) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                count++;
            }
        }
        if(count>nums.length/2){
            return key;
        }
        // Return -1 if key is not the majority element
        return -1;
    }
    public static void main(String args[]){
        int nums[]={2,2,1,1,1,2,2};
        int key=2;
        Practise obj = new Practise();
        int result = obj.majorityElement(nums, key);
        System.out.print(result);

    }
}