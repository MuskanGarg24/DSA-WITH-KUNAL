import java.util.Queue;
import java.util.LinkedList;

public class BT {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node node = new Node(nodes[idx]);
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }

    // preorder traversal
    // time complexity: O(n)
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder tranversal
    // time complexity: O(n)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // postorder traversal
    // time complexity: O(n)
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // level order traversal - question asked in microsoft, facebook, adobe
    // BFS traversal of trees is level order traversal
    /*
     * 1
     * 2 3
     * 4 5 6
     */
    // queue data structure is used to implement level order traversal
    // null is used to mark the end of a level and get a new line
    // time complexity: O(n)

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // count nodes
    // time complexity: O(n)
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    // sum of nodes
    // time complextiy: O(n)
    public static int sumNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    // height of tree
    // time complexity: O(n)
    public static int treeHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // diameter of tree
    // approach - 1 - time complexity: O(n^2)
    // in this approach we are calculating height and diameter separately
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = treeHeight(root.left) + treeHeight(root.right) + 1;
        return Math.max(diam3, Math.max(diam1, diam2));
    }

    // approach - 2 - time complexity: O(n)
    // in this approach we are calculating height and diameter together
    public static class DiaPair {
        int height;
        int diameter;

        DiaPair(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static DiaPair diameter2(Node root) {
        if (root == null) {
            DiaPair basePair = new DiaPair(0, 0);
            return basePair;
        }

        DiaPair left = diameter2(root.left);
        DiaPair right = diameter2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;
        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height + 1;
        int myDiameter = Math.max(diam3, Math.max(diam1, diam2));

        DiaPair myPair = new DiaPair(myHeight, myDiameter);
        return myPair;
    }

    // check whether a subtree is present in a tree
    public static boolean isIdentical(Node root, Node subRoot) {
        // leaf condition
        if (root == null && subRoot == null) {
            return true;
        }

        // if either of them has leaf null then return false
        if (root == null || subRoot == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            return isIdentical(root.left, subRoot) && isIdentical(root.right, subRoot);
        }

        return false;

    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        System.out.print("Preorder traversal: ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder traversal: ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder traversal: ");
        postorder(root);
        System.out.println();
        System.out.println("Level order traversal: ");
        levelOrder(root);
        System.out.println("Number of nodes: " + countNodes(root));
        System.out.println("Sum of nodes: " + sumNodes(root));
        System.out.println("Height of tree: " + treeHeight(root));
        System.out.println("Diameter of tree: " + diameter(root));
        DiaPair p = diameter2(root);
        System.out.println("Diameter of tree: " + p.diameter);

        int nodes2[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt2 = new BinaryTree();
        Node root2 = bt2.buildTree(nodes2);
        System.out.println("Is subtree: " + isSubtree(root, root2));
    }
}