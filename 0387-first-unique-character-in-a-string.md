# leetcode


## my own solution
```
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        char[] ss = s.toCharArray();
       
        
        
        for(int i =0; i < ss.length; i ++ ){
               if(map.containsKey(ss[i])){
                   map.put(ss[i],map.get(ss[i]) + 1);
}
        else{
            map.put(ss[i], 1);
        }}
        
        
        
        for(int j = 0; j < ss.length; j ++){
            if ( map.get(ss[j]) == 1){
                return j;
            }
        }
      
    
          return -1;
}
}
*/
```

## Most votes
```
class Solution {
    public int firstUniqChar(String s) {
       
        int freq[] = new int[26];
        
        for(int i = 0; i < s.length();i ++){
           
            freq[s.charAt(i)-'a']++;
        }
        
        for(int j = 0; j < s.length(); j ++){
            
            if(freq[s.charAt(j)-'a'] == 1){
                return j;
            }
        }
      return -1;   
    }}



```
