package XtraTasks.leetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeInorderTraversal_94 {

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {

            List<Integer> treeList = new ArrayList();
            inorderTraversal(root.left);
            treeList.add(root.val);
            inorderTraversal(root.right);
            return treeList;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 12, 4, 8, 5));

    }
}
