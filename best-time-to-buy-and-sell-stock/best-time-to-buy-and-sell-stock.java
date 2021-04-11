class Solution {
    public int maxProfit(int[] prices) {
        int minPrice =Integer.MAX_VALUE;
        int maxPrice =0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice= prices[i];
            }else{
                int temp = prices[i] - minPrice;
                if(maxPrice <temp){
                    maxPrice = temp;
                }
            }
        }
        return maxPrice;
    }
}