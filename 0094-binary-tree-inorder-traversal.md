# Inorder Tree Traversal:
https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/

```
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null ||!stack.isEmpty()){  // use null not NULL
            if(cur != null){
                stack.push(cur);
                cur = cur.left;}
            else{
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;

            }
        }
        return list;

    }

}
```
