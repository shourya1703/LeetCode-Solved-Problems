import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        List<Integer> list=new ArrayList<>();
         int[] indexarray=new int[2];
        for(int i=0;i<nums.length;i++){
           list.add(nums[i]);
       }
     for(int j=0;j<list.size();j++){
         int temp=target-list.get(j);
         if(list.contains(temp)){
             int m=list.indexOf(temp);
             indexarray[0]=j;
             indexarray[1]=m;
             }
         
     }
        return indexarray;
    }
}