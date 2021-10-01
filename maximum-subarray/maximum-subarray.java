class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int currmax=0;
        for(int i=0;i<nums.length;i++){
            currmax+=nums[i];
            if(currmax>max){
                max=currmax;
            }
            if(currmax<0){
                currmax=0;
            }
        }
        return max;
    }
}