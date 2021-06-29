class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
            for(int j:map.keySet()){
                if(map.get(j)>nums.length/2){
                    return j;
                }
            }
                    return 0;

        }
    }
