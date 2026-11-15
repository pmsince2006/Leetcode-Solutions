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
    public int sumEvenGrandparent(TreeNode root) {
        return dfs(root,null,null);
    }
    public int dfs(TreeNode root,TreeNode parent,TreeNode grandfather){
        if(root == null){
            return 0;
        }

        int sum = 0;
        if(grandfather != null && grandfather.val % 2 == 0){
            sum += root.val;
        }

        sum += dfs(root.left,root,parent);
        sum += dfs(root.right,root,parent);

        return sum;
    }
}