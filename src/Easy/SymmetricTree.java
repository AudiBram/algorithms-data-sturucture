package Easy;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return s == t;
        } else if (s.val != t.val) {
            return false;
        } else {
            return isSymmetric(s.left, t.right) && isSymmetric(s.right, t.left);
        }
    }
}
