class Solution {
    public int removeElement(int[] nums, int val) {
        int flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                nums[i]=Integer.MAX_VALUE;
                flag=1;
            }
        }
        if(flag==0){
            return nums.length;
        }
        Arrays.sort(nums);
        int ans=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==Integer.MAX_VALUE){
                ans=j;
                break;
            }
        }
        return ans;
    }
}