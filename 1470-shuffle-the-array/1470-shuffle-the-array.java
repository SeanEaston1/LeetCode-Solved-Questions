class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr = new int[nums.length];
        
        for(int i=0;i<n;i++){
            arr1[i] = nums[i];
        }
        for(int i=0;i<n;i++){
            arr2[i] = nums[n+i];
        }
        
        int count = 0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i] = arr1[count];
            } else if(i%2!=0){
                arr[i] = arr2[count];
                count++;
            }
        }
        return arr;
    }
}