class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] arr = new int[2*nums.length];
        int j = 0;
        
        for(int i=0; i<2*nums.length;i++){
            if(i==nums.length){
                i=0;
            }
            while(j<2*nums.length){
                arr[j]=nums[i];
                j++;
                break;
            }
            if(j==2*nums.length){
                i=2*nums.length;
            }
        }
        return arr;
    }
}