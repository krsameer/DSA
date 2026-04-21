// Given two binary trees, check if they are identical or not. Two binary trees are considered identical if they are structurally identical and the nodes have the same value.
// Example 1:
// Input: Input: r1 = [1, 2, 3], r2 = [1, 2, 3]
// Output: true
// Explanation: Both the trees are structurally identical and the nodes have the same value.
// Example 2:
// Input: r1 = [1, 2], r2 = [1, null, 2]
// Output: false
// Explanation: Both the trees are structurally different.
// Example 3:
// Input: r1 = [1, 2, 1], r2 = [1, 1, 2]
// Output: false
// Explanation: Both the trees are structurally identical but the nodes don't have the same value.
// You don't need to read input or print anything. Your task is to complete the function isIdentical() which takes the roots of the two binary trees as input and returns true if they are identical, else returns false.
// Expected Time Complexity: O(N), where N is the number of nodes in the binary tree.
// Expected Auxiliary Space: O(N), where N is the number of nodes in the binary tree.

class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class IdenticalTrees {
    public boolean isIdentical(Node r1, Node r2) {
        if(r1==null && r2==null)
        return true;
        if(r2==null || r2==null)
        return false;
    return(r1.data==r2.data) && isIdentical(r1.left,r2.left) && isIdentical(r1.right,r2.right);
    }
}