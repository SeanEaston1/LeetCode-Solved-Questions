/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int mid=0;
        int start = 0;
        int end = n;
        int answer=0;
        if(n==1){
            return 1;
        }
        
        for(int i=1;i<=n;i++){
            mid = start + (end-start)/2;
            answer=guess(mid);
            if(answer==-1){
                end = mid-1;
            } else if(answer==1){
                start = mid+1;
            } else if(answer==0){
                break;
            }
        }
        return mid;
    }
}