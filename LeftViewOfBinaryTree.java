// Left View of Binary Tree
// Given a binary tree, return an array containing the left view of the binary tree. The left view of a binary tree is the set of nodes visible when the tree is viewed from the left side. 


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