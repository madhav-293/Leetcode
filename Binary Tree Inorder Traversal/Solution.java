/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<Integer>();
        Stack <TreeNode> stack=new Stack<>();
        TreeNode curr=root;
        // if(root==null)
        //     return l;
        // Stack<TreeNode> stack=new Stack<>();
        TreeNode temp=root;
        while(curr!=null || !stack.isEmpty()){
            if(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            else{
                curr=stack.pop();
                l.add(curr.val);
                curr=curr.right;
            }
        }
        return l;
    }
}
