package Trees;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        IF less than root value, traverse left side
        if (p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);

//        IF greater than root value, traverse left side
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
            
        }
//        IF root value is in between p.value and q.value then that is their least common ancestor
        return root;
    }
}
