
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BTBS {
    public int maxProfit(int[] prices) {
    
      /*
      int maxProfit = 0; 
      int buy = prices[0];
      for(int i =1; i < prices.length; i++){
        int price = prices[i];
        if(price > buy){
            maxProfit = Math.max(maxProfit, price - buy);
        }
        buy = Math.min(buy, price);
      }
    */
    
      int minPrice = Integer.MAX_VALUE; 
      int maxProfit =0;
      for(int price : prices){     
           if(price < minPrice){
                minPrice = price;
            }
            else if(price - minPrice > maxProfit){

                maxProfit = price - minPrice;
            }
          

      }
       return maxProfit;
    }
    public static void main(String[] args) {
        
    }
}

