package XtraTasks.dataStructures_01.trees;

import java.util.Scanner;

public class TreeNodeDemo {
    // create the tree first root, left and right nodes
    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    TreeNode root; // one root only

    TreeNodeDemo() {
        root = null;
    }

    public TreeNode insert(TreeNode root, int dataToBeInserted) {
        if (root == null) {
            root = new TreeNode(dataToBeInserted);
            return root;
        }
        if (root.data > dataToBeInserted) {
            root.left = insert(root.left, dataToBeInserted);
        } else if (root.data < dataToBeInserted) {
            root.right = insert(root.right, dataToBeInserted);
        }
        return root;
    }

    public TreeNode search(TreeNode root, int dataToBeSearched) {
        if (root == null || root.data == dataToBeSearched)
            return root;
        if (root.data > dataToBeSearched) {
            return search(root.left, dataToBeSearched);
        }
        return search(root.right, dataToBeSearched); // if root.data< dataToBeSearched
    }

    public void inOrder(TreeNode root) {
        // inorder traversal ->> visit all the nodes on the left, visit root, visit nodes on the right

        if (root == null) // check if root is present
            return;

        inOrder(root.left);
        System.out.print(root.data + " "); // print the root
        inOrder(root.right);


    }

    public void preOrder(TreeNode root) {
        if (root == null) // check if root is present
            return;
        System.out.print(root.data + " "); // print the root
        inOrder(root.left);
        inOrder(root.right);

    }

    public void postOrder(TreeNode root) {
        if (root == null) // check if root is present
            return;
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data + " "); // print the root

    }

    public void insertIntoTree(int dataToBeInserted) {
        root = insert(root, dataToBeInserted);
    }

    public TreeNode searchTree(int dataToBeSearched) {
        return search(root, dataToBeSearched);
    }

    public void inOrderTraversal() {
        inOrder(root);
    }

    public void preOrderTraversal() {
        preOrder(root);
    }

    public void postOrderTraversal() {
        postOrder(root);
    }

    public static void main(String[] args) {
        TreeNodeDemo tnd = new TreeNodeDemo();
        int noOfElements, num;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter no of elements to insert : ");
        noOfElements = kb.nextInt();
        System.out.println(" Enter " + noOfElements + " numbers :");
        for (int i = 0; i < noOfElements; i++) {
            num = kb.nextInt();
            tnd.insertIntoTree(num);

        }
        System.out.println("Tree insertion is completed!");
        System.out.println("Enter the number to be searched : ");
        int searchNo = kb.nextInt();
        if (tnd.searchTree(searchNo) != null) {
            System.out.println("Number found!");
        } else {
            System.out.println("Number not found!");
        }
        System.out.println("Inorder traversal of binary search tree ");
        tnd.inOrderTraversal();

        System.out.println("Preorder traversal of binary search tree ");
        tnd.preOrderTraversal();

        System.out.println("Postorder traversal of binary search tree ");
        tnd.postOrderTraversal();
    }

}
