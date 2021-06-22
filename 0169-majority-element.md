# leetcode

## my solution
```
class Solution {
    public int majorityElement(int[] nums) {
     int n = nums.length;
     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
     
     
     
     for(int i = 0; i < nums.length; i ++){
     if(map.containsKey(nums[i]))
     {
         map.put(nums[i], map.get(nums[i])+1);
         
     }else{ map.put(nums[i], 1);
           }
     
     }
     
     for(int j = 0; j < nums.length; j ++){
     
     if(map.get(nums[j]) > n/2 ){
     
         return nums[j];
     }
         
     }
      
      
     return -1; 
    }
}

```


## most votes
Attention: i in the for loop starts from 1, not 0; 

```
public class Solution {
    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
            
        }
        return major;
    }
}

```



