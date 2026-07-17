// class Solution {
//     public int maxProfit(int[] prices) {
//         int lowest=prices[0];
//         int maxProfit = 0;
//         for(int i = 0 ; i< prices.length ; i++){
//             int currentProfit =prices[i]-lowest;
//             if(lowest>prices[i]){
//                     lowest = prices[i];
//             }
//             if(currentProfit>maxProfit){
//                 maxProfit=currentProfit;
//             }
            
//         }
//         return maxProfit;

//     }
// }

// THE BELOW APPROACH UPDATES LOWER VALUE FIRST THEN CHECKS FOR PROFIT. BOTH ARE EQUALLY VALID.

class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int maxProfit = 0;
        for(int i = 0; i<prices.length; i++){
            
            if(prices[i]<lowest){
                lowest=prices[i];
            }
            int currentProfit = prices[i]-lowest;
            if(currentProfit>maxProfit){
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
