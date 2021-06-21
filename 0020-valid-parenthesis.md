
### java string methods:
https://www.w3schools.com/java/java_ref_string.asp


### return statement:
not return true, but return stack.isEmpty(). This is because (1) all the braces are perfectly matched ad closed. (2) some braces have only 
first part but not second part.



```

class Solution {
    public boolean isValid(String s) {
    
        Stack<Character> stack = new Stack<Character>();
        
        
        for(Character c : s.toCharArray()){
         if(c == '('){
          stack.push(')');
           }
            else if(c == '{'){
              stack.push('}');  
            }
            else if(c == '['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != c){
                return false;
}
        
        }
        return stack.isEmpty();
        
    }
}

```

