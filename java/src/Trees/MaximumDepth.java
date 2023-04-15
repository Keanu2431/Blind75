package Trees;

public class MaximumDepth {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftCount = maxDepth(root.left);
        int rightCount = maxDepth(root.right);
        return 1 + Math.max(leftCount, rightCount);
    
    }
}
