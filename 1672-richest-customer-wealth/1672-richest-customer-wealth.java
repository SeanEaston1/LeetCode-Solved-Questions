class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int[] arr = new int[accounts.length];
        int max =0;
        
        for(int i=0;i<accounts.length;i++){
            arr[i] = 0;
            int x = accounts[i].length;
            for(int j=0;j<x;j++){
                arr[i] = accounts[i][j] + arr[i];
            }
        }
        for(int k=0; k<arr.length;k++){
            max = Math.max(arr[k],max);
        }
        return max;
    }
}