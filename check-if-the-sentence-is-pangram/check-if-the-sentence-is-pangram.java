class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set1=new HashSet<>();
        char[] ch=sentence.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            set1.add(ch[i]);
        }
        Set<Character> set2=new HashSet<>();
        for(char c='a';c<='z';c++){
            set2.add(c);
        }
        if(set1.containsAll(set2)){
            return true;
        }
        else{
            return false;
        }
    }
}