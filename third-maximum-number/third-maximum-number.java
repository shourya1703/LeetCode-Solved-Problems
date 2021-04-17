class Solution {
    public int thirdMax(int[] nums) {
       Set<Integer> set1=new HashSet<>();
        for(int i : nums){
            set1.add(i);
        }
        int[] arr=new int[set1.size()];
        Iterator<Integer> it=set1.iterator();
        int j=0;
        while(it.hasNext()){
            arr[j]=it.next();
            j++;
        }
        Arrays.sort(arr);
        if(arr.length<3){
            return arr[arr.length-1];
        }
        else{
            return arr[arr.length-3];
        }
}
}