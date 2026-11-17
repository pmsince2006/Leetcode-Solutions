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
    ArrayList<Integer> arr = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);

        TreeNode dummy = new TreeNode(0);
        TreeNode curr = dummy;

        for(int val : arr){
            curr.right = new TreeNode(val);

            curr = curr.right;
        }

        return dummy.right;
    }

    public void inorder(TreeNode root){
        if(root == null){
            return;
        }

        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
}