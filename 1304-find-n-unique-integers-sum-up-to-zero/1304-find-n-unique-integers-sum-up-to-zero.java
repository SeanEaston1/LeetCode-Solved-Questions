class Solution {
    public int[] sumZero(int n) {
        
        int[] arr = new int[n];
        

        // Check if the value of n is Even or Odd
        if(n%2==0){
            int j=1;
            for(int i=0;i<n;i++){
                if(i<n/2){
                    arr[i]=i+1;
                } else {
                    arr[i]=-(arr[(n/2)-j]);
                    j++;
                }
            }
        }

        // Check if the value of n is Even or Odd
        else if(n%2!=0){
            int j=2;
            for(int i=0;i<n;i++){
                if(i<n/2){
                    arr[i]=i+1;
                } else if(i==n/2){
                    arr[i]=0;
                } else if(i>n/2){
                    arr[i]=-(arr[((n/2)+1)-j]);
                    j++;
                }
            }     
        }
        return arr;
    }
}