class Solution {
    public int[] searchRange(int[] nums, int target) {
    
        int[] arr = {-1,-1};
        
        int i=0;
        
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr[0] = i;
                break;
            }
        }
        
        for(int j=i;j<nums.length;j++){
            if(nums[j]==target){
                arr[1] = j;
            }
        }

        return arr;
    }
}