class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        // If target character is not available return first character     
        if(target>=letters[end]){
            return letters[start];
        }

        // Code of Ceiling of a number
        while(start<=end){
            int middle = start + (end-start)/2;
            if(target<letters[middle]){
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return letters[start];
    }
}