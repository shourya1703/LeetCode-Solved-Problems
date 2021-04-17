class Solution {
public int sumOfUnique(int[] nums) {
        int arr[] = new int[101];
        int sum = 0;
        for(int num:nums){
            arr[num]++;
        }
        
        for(int i = 1; i<arr.length; ++i){
            if(arr[i]==1) sum+=i;
        }
        
        return sum;
    }
}