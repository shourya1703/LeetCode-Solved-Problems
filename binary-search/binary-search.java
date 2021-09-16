class Solution {
    public int search(int[] nums, int target) {
        int first=0,mid;
        int last=nums.length-1;
        
        while(first<=last){
            mid=(first+last)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(target>nums[mid]){
                first=mid+1;
               // mid=(first+last)/2;
            }
            else{
                last=mid-1;
               // mid=(first+last)/2;
                
            }
        }
        return -1;
    }
}