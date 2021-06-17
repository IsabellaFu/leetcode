## Bitwise operator
left shift: https://docs.microsoft.com/en-us/cpp/cpp/left-shift-and-right-shift-operators-input-and-output?view=msvc-160/
/
AND &: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Bitwise_AND

```
class Solution {
    public int[] countBits(int n) {
       int[] f = new int[n + 1]; 
        for(int i = 1;i < n+1;i ++)
            f[i] = f[i >> 1]+ (i&1);
    return f;
    }
    
}
```
