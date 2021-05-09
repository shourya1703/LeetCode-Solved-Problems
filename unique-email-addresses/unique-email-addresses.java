class Solution {
    public int numUniqueEmails(String[] emails) {
         List<String> list=new ArrayList<>();
        for(String i:emails){
           String[] str=i.split("@");
            String temp="";
            for(int j=0;j<str[0].length();j++){
                char c = str[0].charAt(j);
                if(c=='.'){
                    continue;
                }
                if(c=='+'){
                    break;
                }
                temp+=c;
            }
            temp=temp+"@"+str[1];
            if(!list.contains(temp)){
             list.add(temp);
            }
        }
        return list.size();
        }
        
    
}