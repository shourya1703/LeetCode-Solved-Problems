class Solution {
    public int search(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        if(list.contains(target)){
            return list.indexOf(target);
        }
        
        return -1;
    }
}