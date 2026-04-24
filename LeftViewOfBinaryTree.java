import java.util.ArrayList;


class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}


  class LeftViewOfBinaryTree {
    ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> leftView(Node root) {
        solve(root, 0);
        return result;
    }
    void solve(Node node, int level) {
        if (node == null) return;
        if (level == result.size()) {
            result.add(node.data);
        }
        solve(node.left, level + 1);
        solve(node.right, level + 1);
    }
}