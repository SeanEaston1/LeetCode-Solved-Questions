class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int n = nums.length;
    
        // Calculate left values and store in arr.
        int left = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0)
                left = left * nums[i - 1];
            arr[i] = left;
        }
        
        // Calculate right values and the product from the end of the array.
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1)
                right = right * nums[i + 1];
            arr[i] = arr[i]*right;
        }
        
        return arr;
    }
}
