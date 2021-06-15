
```
class Solution {
    public int maxProfit(int[] prices) {
       int min = prices[0];// attention: don't initialize min = 0;
       int max = 0;
        
        for(int price : prices){// for loop array syntax;
           min = Math.min(min, price);
           max = Math.max(max, price - min);
        }
        
        return max;
        
    }
}
```
