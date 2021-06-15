## Dynamic Programming
https://www.geeksforgeeks.org/dynamic-programming/

## Similar problem solution on GeeksforGeeks
https://www.geeksforgeeks.org/k-maximum-sums-non-overlapping-contiguous-sub-arrays/

## Conditional Operator 
condition ? return truth: return false

```
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[]A = nums;
        int[] dp = new int[n];//array dimension required;
        dp[0] = A[0];
        int max = dp[0];
        for(int i = 1;i < n; i ++){
            dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i -1]:0);//condition?return true:return false;
            max = Math.max(dp[i],max);
}
        return max;
    }
}
```
