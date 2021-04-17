class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        Set<Integer> set1=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set1.add(nums[i]);
        }
        int max=nums.length;
        for(int j=1;j<=max;j++){
            if(set1.contains(j)){
                continue;
            }
            else{
                list.add(j);
            }
        }
        
            return list;
        }
        
        }
        
    
