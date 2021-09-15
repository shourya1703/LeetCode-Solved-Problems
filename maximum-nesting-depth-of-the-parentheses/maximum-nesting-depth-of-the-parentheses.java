class Solution {
    public int maxDepth(String s) {
        int brackets=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                brackets++;
            }
            if(s.charAt(i)==')'){
                brackets--;
            }
            if(max<brackets){
                max=brackets;
            }
        }
            return max;
    }
}
