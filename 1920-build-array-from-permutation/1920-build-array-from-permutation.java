class Solution {
    public int[] buildArray(int[] nums) {
        int[] answer = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int arr = nums[i];
            while(arr< nums.length){
                int ans = nums[arr];
                answer[i] = ans;
                break;
            }
        }
        return answer;
    }
}