class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> l1=new ArrayList<>();
        for(int j=0;j<magazine.length();j++){
            l1.add(magazine.charAt(j));
        }
        for(int i=0;i<ransomNote.length();i++){
            if(l1.contains(ransomNote.charAt(i))){
                l1.remove(Character.valueOf(ransomNote.charAt(i)));
            }
            else{
                return false;
            }
        }
        return true;
    }
}