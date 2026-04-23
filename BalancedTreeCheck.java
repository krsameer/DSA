// Balanced Tree Check


class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}

class BalancedTreeCheck {
    public boolean isBalanced(Node root) {
        return height(root) != -1;
    }
    private int height(Node root) {
        if (root == null) 
        return 0;
        int leftHeight = height(root.left);
        if (leftHeight == -1) 
        return -1;
        int rightHeight = height(root.right);
        if (rightHeight == -1) 
        return -1;
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}