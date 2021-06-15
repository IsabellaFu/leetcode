## char.At() & String.length()

```
    class Solution {
    public int titleToNumber(String columnTitle) {
        String c = columnTitle;
        int result = 0;
        int n = c.length();// remember to add () after call length function
        for(int i = 0; i < n; i++){
        result = result*26 + (c.charAt(i) - 'A' +1);
        };
    
    return result;
    }
}

```
