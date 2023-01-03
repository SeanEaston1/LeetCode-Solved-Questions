class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1 = 0;
        int sum2 = 0;
        
        // for(int i=0; i<mat.length; i++){
        //     sum1 = sum1 + mat[i][i];
        //     if(i != (mat[i].length-(i+1))){
        //         sum2 = sum2 + mat[i][mat[i].length-(i+1)];
        //     }
        // }
        // return sum1+sum2;
        
        for(int i=0; i<mat.length; i++){
            sum1 = sum1 + mat[i][i];
            sum2 = sum2 + mat[i][mat[i].length-(i+1)];
        }
        int sum = sum1+sum2;
        if(mat.length%2!=0){
            sum = sum - mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}