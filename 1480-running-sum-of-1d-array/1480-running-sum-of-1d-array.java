class Solution {
    public int[] runningSum(int[] nums) {
        int[] res=new int[nums.length];
        res[0]=nums[0];
        int sum=res[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            res[i]=sum;
        }
        return res;
        
    }
}