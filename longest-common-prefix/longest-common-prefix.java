class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lcs=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(lcs)!=0){
                lcs=lcs.substring(0,lcs.length()-1);
            }
        }
        return lcs;
    }
}