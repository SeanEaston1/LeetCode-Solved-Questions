class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int[] arr = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            for(int j=(i+1);j<nums.length;j++){
                if(nums[i]==nums[j]){
                    i=j;
                }
            }
            arr[count] = nums[i];
            // nums[count] = nums[i];
            count++;
        }
        
        for(int i=0;i<nums.length;i++){
            nums[i] = arr[i];
        }
        return count;
    }
}