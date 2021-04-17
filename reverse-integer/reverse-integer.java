class Solution {
    public int reverse(int x) {
        int temp=0;
        long rev=0;
        while(x!=0){
            
            temp=x%10;
            x=x/10;
            rev=rev*10+temp;
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){
            return 0;
        }
        return (int)rev;
           
        }
    }
