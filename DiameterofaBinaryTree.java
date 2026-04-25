// Calculate the diameter of a binary tree
// The diameter of a binary tree is the length of the longest path between any two nodes in the tree. This path may or may not pass through the root.   
// The diameter of a binary tree can be calculated using a depth-first search (DFS) approach. We can define a recursive function that calculates the height of the tree while also updating the diameter at each node. The diameter at any node is the sum of the heights of its left and right subtrees.   

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

class DiameterofaBinaryTree{
    int maxDiameter=0;
    public int dimaeter(Node root){
        height(root);
        return maxDiameter;
    }
private int height(Node node){
    if(node==null) return 0;
    int left=height(node.left);
    int right=height(node.right);
    maxDiameter=Math.max(maxDiameter,left+right);
    return 1+Math.max(left,right);
}
}