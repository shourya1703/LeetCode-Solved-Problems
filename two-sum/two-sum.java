class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m1.containsKey(nums[i])){
                return new int[]{i,m1.get(nums[i])};
            }
            else{
                m1.put(target-nums[i],i);
            }
        }
        return new int[]{};
    }
}