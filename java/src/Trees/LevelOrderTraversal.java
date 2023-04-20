package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return res;
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevelList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                currentLevelList.add(current.val);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            res.add(currentLevelList);
        }
        return res;
    }
    public List<List<Integer>> levelOrderT(TreeNode root) {
        //        Input: root = [3,9,20,null,null,15,7]
//        Output: [[3],[9,20],[15,7]]


//        FIND A WAY TO TRAVERSE
//        KEEP TRACK OF LEVEL
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return res;
        queue.add(root);
        while (!queue.isEmpty()) {
//            HOW MANY NODES IN CURRENT LEVEL
            int size = queue.size();

//            LIST OF NODE VALUES FOR THE CURRENT LEVEL
            List<Integer> currentLevelList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
//                removing the current item from queue  "FIFO"
                TreeNode current = queue.remove();
                currentLevelList.add(current.val);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            res.add(currentLevelList);
        }
        return res;
    }
}
