
class InvertBinaryTree {
    public Node invertTree(Node root) {
        if(root==null) return null;
        Node l=root.left;
        Node r=root.right;
        root.left=invertTree(r);
        root.right=invertTree(l);
        return root;

    }
}