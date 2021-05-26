class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        int[] arr=new int[2];
        arr[0]=list.indexOf(target);
        arr[1]=list.lastIndexOf(target);
        return arr;
    }
}