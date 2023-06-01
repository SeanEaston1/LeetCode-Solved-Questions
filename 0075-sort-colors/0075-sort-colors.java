class Solution {
    public void sortColors(int[] nums) {
        
        int[] arr = new int[nums.length];
        int x=0;
        int a=0;

        while(a<=2){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==a){
                    arr[x]=a;
                    x++;
                }
            }
            a++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = arr[i];
        }
    }
}