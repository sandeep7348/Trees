import javax.swing.tree.TreeNode;

public class LowestCommonAncestor {
     boolean contains(Node root,Node node)
    {
        if(root==null) return false;
        if(root==node) return true;
        return contains(root.left,node) || contains(root.right,node); 
    }
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(p==root || q==root) return root;
        if(p==q) return p;
        boolean leftp=contains(root.left,p);
        boolean rightp=contains(root.right,q);
        if(leftp && rightp) return root;
        if(!leftp && rightp) return lowestCommonAncestor(root.right,p,q);
        if(leftp && !rightp) return lowestCommonAncestor(root.left,p,q);
        if(!leftp && !rightp) return root;
        return null;
    }
    
}
