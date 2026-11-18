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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        
        Stack<TreeNode> s1 = new Stack<>(); // Left to right
        Stack<TreeNode> s2 = new Stack<>(); // Right to left
        s1.push(root);
        
        while (!s1.isEmpty() || !s2.isEmpty()) {
            List<Integer> lvl = new ArrayList<>();
            
            while (!s1.isEmpty()) {
                TreeNode curr = s1.pop();
                lvl.add(curr.val);
                // Push left first, then right, so s2 pops right-to-left
                if (curr.left != null) s2.push(curr.left);
                if (curr.right != null) s2.push(curr.right);
            }
            if (!lvl.isEmpty()) {
                res.add(lvl);
                lvl = new ArrayList<>();
            }
            
            while (!s2.isEmpty()) {
                TreeNode curr = s2.pop();
                lvl.add(curr.val);
                // Push right first, then left, so s1 pops left-to-right
                if (curr.right != null) s1.push(curr.right);
                if (curr.left != null) s1.push(curr.left);
            }
            if (!lvl.isEmpty()) {
                res.add(lvl);
            }
        }
        
        return res;
    }
}