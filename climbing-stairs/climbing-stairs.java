class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int first=1;
        int second=1;
        int sum=0;
        
        for(int i=2;i<=n;i++){
            sum=first+second;
            first=second;
            second=sum;
        }
        return sum;
    }
}