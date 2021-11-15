class Solution {
    public int lengthOfLastWord(String s) {
        String[] split=s.split(" ");
        String last=split[split.length-1];
        int count=0;
        for(int i=0;i<last.length();i++){
            if(last.charAt(i)!=' '){
                count++;
            }
        }
        return count;

    }
}