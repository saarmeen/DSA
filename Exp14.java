class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class Exp14 {
    private TreeNode root;

    public Exp14() {
        this.root = null;
    }

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private TreeNode insertRecursive(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursive(root.right, data);
        }

        return root;
    }

    public void delete(int data) {
        root = deleteRecursive(root, data);
    }

    private TreeNode deleteRecursive(TreeNode root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRecursive(root.right, data);
        } else {

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }


            root.data = minValue(root.right);


            root.right = deleteRecursive(root.right, root.data);
        }

        return root;
    }

    private int minValue(TreeNode root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public void preorderTraversal() {
        System.out.print("Preorder Traversal: ");
        preorderRecursive(root);
        System.out.println();
    }

    private void preorderRecursive(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRecursive(root.left);
            preorderRecursive(root.right);
        }
    }

    public void inorderTraversal() {
        System.out.print("Inorder Traversal: ");
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(TreeNode root) {
        if (root != null) {
            inorderRecursive(root.left);
            System.out.print(root.data + " ");
            inorderRecursive(root.right);
        }
    }

    public void postorderTraversal() {
        System.out.print("Postorder Traversal: ");
        postorderRecursive(root);
        System.out.println();
    }

    private void postorderRecursive(TreeNode root) {
        if (root != null) {
            postorderRecursive(root.left);
            postorderRecursive(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Exp14 bst = new Exp14();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        bst.inorderTraversal();
        bst.preorderTraversal();
        bst.postorderTraversal();

        bst.delete(30);

        bst.inorderTraversal();
    }
}
