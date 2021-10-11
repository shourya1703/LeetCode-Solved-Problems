class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l1=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums1){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(int j:nums2){
            if(map.containsKey(j)){
                if(map.get(j)>0){
                l1.add(j);
                map.put(j,map.get(j)-1);
                }
            }
        }
        int[] ans=new int[l1.size()];
        for(int k=0;k<l1.size();k++){
            ans[k]=l1.get(k);
        }
        return ans;
    }
        
        
}
