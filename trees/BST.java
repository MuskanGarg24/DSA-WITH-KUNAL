import java.util.ArrayList;

public class BST {
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    // build a BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.value > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    // traverse the BST using inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    // search for a value in the BST
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.value > key) {
            return search(root.left, key);
        } else if (root.value < key) {
            return search(root.right, key);
        }
        return true;
    }

    // delete a node from the BST
    public static Node delete(Node root, int val) {
        if (root.value > val) {
            root.left = delete(root.left, val);
        } else if (root.value < val) {
            root.right = delete(root.right, val);
        } else { // root.value == val
                 // case-1 : leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case-2 : one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case-3 : two children
            Node IS = getInorderSuccessor(root.right);
            root.value = IS.value;
            root.right = delete(root.right, IS.value);
        }
        return root;
    }

    public static Node getInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // print in range
    // X < root < Y --> make calls to left and right subtree
    // X > root --> make call to right subtree
    // Y < root --> make call to left subtree
    public static void printInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.value >= x && root.value <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.value + " ");
            printInRange(root.right, x, y);
        } else if (root.value >= x) {
            printInRange(root.right, x, y);
        } else if (root.value <= y) {
            printInRange(root.left, x, y);
        }
    }

    // class Solution {
    // public int rangeSumBST(TreeNode root, int low, int high) {
    // int sum = 0;
    // if(root == null){
    // return 0;
    // }
    // if(root.val >= low && root.val <= high){
    // sum += root.val;
    // }
    // if(root.val > low){
    // sum += rangeSumBST(root.left, low, high);
    // }
    // if(root.val < high){
    // sum += rangeSumBST(root.right, low, high);
    // }
    // return sum;
    // }
    // }

    // root to leaf paths
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

    public static void printRootToLeafPaths(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        // leaf node condition
        path.add(root.value);

        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            // non leaf nodes condition
            printRootToLeafPaths(root.left, path);
            printRootToLeafPaths(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    // driver code
    public static void main(String args[]) {
        int[] values = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        if (search(root, 50)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
        root = delete(root, 5);
        inorder(root);
        System.out.println();
        printInRange(root, 4, 7);
        System.out.println();
        System.out.println("Printing root to leaf paths");
        ArrayList<Integer> path = new ArrayList<>();
        printRootToLeafPaths(root, path);
    }
}