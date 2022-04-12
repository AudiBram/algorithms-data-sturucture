package Easy;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        } else if (isSameTree(root, subRoot)) {
            return true;
        } else {
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

    public boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null || t == null) {
            return s == null && t == null;
        } else if (s.val == t.val) {
            return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
        } else {
            return false;
        }
    }
}
