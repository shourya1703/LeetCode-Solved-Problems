class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> s1=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s1.isEmpty()){
                s1.push(s.charAt(i));
            }
            else if(s1.peek()==s.charAt(i)){
                s1.pop();
            }
            else{
                s1.push(s.charAt(i));
            }
        }
        while(!s1.isEmpty()){
            sb.append(s1.pop());
        }
        
        return sb.reverse().toString();
}
}