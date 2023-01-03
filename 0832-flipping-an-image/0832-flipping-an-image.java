class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int last = image.length - 1;
        int a=0;
        int[][] arr = new int[image.length][image[0].length];
        
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                arr[i][j] = image[i][last-j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                } else if(arr[i][j]==1){
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }
}