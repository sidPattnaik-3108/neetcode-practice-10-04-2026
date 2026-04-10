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
    public List<List<Integer>> levelOrder(TreeNode root) {

        
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> innerList = new ArrayList<>();
            for(int i = 0; i< queueSize; i++){
                TreeNode temp = queue.poll();
                innerList.add(temp.val);
                if(temp.left!= null){
                    queue.offer(temp.left);
                }
                if(temp.right!= null){
                    queue.offer(temp.right);
                }
            }
            list.add(innerList);
        }

        return list;
        
    }
}
