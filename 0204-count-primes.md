## original solution

```
class Solution {
    public int countPrimes(int n) {
     boolean[] notprime = new boolean[n];
     int count = 0;
        for(int i = 2; i < n;i ++){
            if (notprime[i] == false){
                count ++;
                for(int j = 2; j*i < n;j ++){
                    notprime[i*j] = true;
                }
            }
        }
    return count;
    }
}
```



## optimized solution

```
class Solution{
public int countPrimes(int n) {
    if(n <=1 ) return 0;
    
    boolean[] notPrime = new boolean[n];        
    notPrime[0] = true; 
    notPrime[1] = true; 

    for(int i = 2; i < Math.sqrt(n); i++){
        if(!notPrime[i]){
            for(int j = 2; j*i < n; j++){
                notPrime[i*j] = true; 
            }
        }
    }
    
    int count = 0; 
    for(int i = 2; i< notPrime.length; i++){
        if(!notPrime[i]) count++;
    }
    return count; 
}
}
```
