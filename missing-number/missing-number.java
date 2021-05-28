/*class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int temp=nums[0];
        for(int i=0;i<nums.length;i++)
             if(nums[i]==temp){
                 temp++;
             }
             else{
                return temp;
             }
        return 1;
    }
}*/
class Solution {
    public int missingNumber(int[] nums) {
        int found =0;
        for(int i=0;i<=nums.length;i++){
            found=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    found = 1;
                    
                }
            }
            if(found!=1){
                return i;
            }
        }
        return -1;
    }
}