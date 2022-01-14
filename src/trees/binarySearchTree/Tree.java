package trees.binarySearchTree;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void printInOrder() {
        if (root != null) {
            root.printInOrder();
        }
    }

    public void get(int item) {
        if (root != null) {
            TreeNode node = root.get(item);
            if (node == null) {
                System.out.println("Item : " + item + " Not Found in Tree");
            } else {
                System.out.println(node.toString());
            }
        }

    }

    public void getMaxMin() {
        if (root != null) {
            System.out.println("Maximum Value of the Tree is : " + root.getMax().toString());
            System.out.println("Minimum Value of the Tree is : " + root.getMin().toString());
        }
    }

    public void delete(int value) {
        root = delete(root, value);

    }

    private TreeNode delete(TreeNode subTreeRoot, int value) {
        if (subTreeRoot == null) {
            return subTreeRoot;
        }
        // Find the node to delete and that node is subTreeNode
        if (value < subTreeRoot.getData()) {
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        } else if (value > subTreeRoot.getData()) {
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        } else {
            //Case 0 and 1 - one child node or leaf node
            if (subTreeRoot.getLeftChild() == null) {
                return subTreeRoot.getRightChild();
            } else if (subTreeRoot.getRightChild() == null) {
                return subTreeRoot.getLeftChild();
            }

            //Case 2 : when the node has 2 children
            subTreeRoot.setData(subTreeRoot.getRightChild().getMin().getData());
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
        }

        // Case Node not found in this case return the subTreeRoot Back
        return subTreeRoot;
    }
}
