1.注意if三个条件的顺序，为什么一定要把==条件放在第一个才能顺利执行呢
2.注意为什么最后return right（找的是upper bound）

```
class Solution {
    public int mySqrt(int x) {
      int left = 1;
        int right = x;
        while(left <= right){
            
            int mid = left + (right - left)/2;
            
            
            
    if (mid == x / mid)
            {
        return mid;
            }    
            else if(mid < x / mid){
                left = mid + 1;
              
            } else if (mid > mid / x) {
                right = mid -1;
            } 
                  
        }
        return right;
    }
}

```
