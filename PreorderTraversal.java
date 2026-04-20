// Given the root of a binary tree, your task is to return its Preorder traversal.
// Note: A preorder traversal first visits the node, then visits the left child (including its entire subtree), and finally visits the right child (including its entire subtree).
// Example 1:
// Input: Input: root = [1, 4, N, 4, 2]
// Output: [1, 4, 4, 2]
// Explanation: The preorder traversal of the given tree is [1, 4, 4, 2].
// Example 2:
// Input: root = [6, 3, 2, N, 1, 2, N]
// Output: [6, 3, 1, 2, 2]
// Explanation: The preorder traversal of the given tree is [6, 3, 1, 2, 2].
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function preOrder() which takes the root of the binary tree as input and returns an ArrayList containing the preorder traversal of the tree.
// Expected Time Complexity: O(N), where N is the number of nodes in the binary tree.
// Expected Auxiliary Space: O(N), where N is the number of nodes in the binary tree.


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