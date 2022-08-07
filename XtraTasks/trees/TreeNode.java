package XtraTasks.trees;

public class TreeNode {
    int val; // current value
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {  // constructor when there are no child nodes
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) { // constructor with child nodes
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
