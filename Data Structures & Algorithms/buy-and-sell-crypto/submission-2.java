class Solution {
    public int maxProfit(int[] prices) {

       //Optimal Approach : Time complexity will be O(N)

        int maxProfit = 0;
        int min = prices[0];

        for ( int i = 1 ; i < prices.length ; i++ ) {
            min = Math.min(min,prices[i]);

            int profit = prices[i] - min; //particular day profit

            maxProfit = Math.max(maxProfit,profit);
        }

        return maxProfit;
        //Brute force : Time complezity is O(N^2)
        // int maxProfit = 0;
        // for ( int i = 0; i < prices.length-1; i++) {
        //     for ( int j = i+1; j < prices.length; j++) {
        //         maxProfit = Math.max(maxProfit,prices[j]-prices[i]);
        //     }
        // }
        // return maxProfit;
    }
}
