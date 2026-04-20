// Given the root of a binary tree, your task is to return its Preorder traversal.
// Note: A preorder traversal first visits the node, then visits the left child (including its entire subtree), and finally visits the right child (including its entire subtree).
import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data=data;
        this.right=null;
        this.left=null;
    }
}

class PreorderTraversal {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null)
        return result;
        ans(root,result);
        return result;
    }
    void ans(Node node, ArrayList<Integer> result) {
        if (node == null) return;
        result.add(node.data);
        ans(node.left, result);
        ans(node.right, result);
    }
}