class Solution {
    public boolean checkIfPangram(String sentence) {
        
        if(sentence.length()<26){
            return false;
        }
        
        // To convert String to Array
        char[] ch = new char[sentence.length()];
        
        for(int i=0;i<sentence.length();i++){
            ch[i] = sentence.charAt(i);
        }
        // ***************************
        
        for(char i='a';i<='z';i++){
            int count=0;
            for(int j=0;j<sentence.length();j++){
                if(i==ch[j]){
                    count++;
                }
            }
            if(count==0){
                return false;
            }
        }
        return true;
    }
}