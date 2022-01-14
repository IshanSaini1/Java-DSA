package trees.binarySearchTree;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public void printInOrder() {
        if (leftChild != null) {
            leftChild.printInOrder();
        }
        System.out.print(data + " / ");
        if (rightChild != null) {
            rightChild.printInOrder();
        }
    }

    public TreeNode get(int item) {
        if (data == item) {
            return this;
        }
        if (data > item) {
            if (leftChild != null) {
                return leftChild.get(item);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(item);
            }
        }
        return null;
    }

    public TreeNode getMin() {
        if (leftChild != null) {
            return leftChild.getMin();
        } else {
            return this;
        }
    }

    public TreeNode getMax() {
        if (rightChild != null) {
            return rightChild.getMax();
        } else {
            return this;
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}
