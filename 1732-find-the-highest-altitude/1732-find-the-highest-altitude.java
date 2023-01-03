class Solution {
    public int largestAltitude(int[] gain) {
        
        int arr[] = new int[gain.length+1];
        arr[0] = 0;
        arr[1] = gain[0];
        int max = 0;
        
        for(int i=2;i<arr.length;i++){
            arr[i] = gain[i-1] + arr[i-1];
        }
        
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}