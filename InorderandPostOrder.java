class InorderandPostOrder {
    public Node helper(int [] preorder,int prelo,int prehi,int [] inorder, int inlo,int inhi)
    {
        if(prelo>prehi) return null;
        Node root=new Node(preorder[prelo]);
        int i=inlo;
        while(preorder[prelo]!=inorder[i]) i++;
        int leftsize=i-inlo;
        root.left=helper(preorder,prelo+1,prelo+leftsize,inorder,inlo,i-1);
        root.right=helper(preorder,prelo+leftsize+1,prehi,inorder,i+1,inhi);
        return root;
    }
    public Node buildTree(int[] preorder, int[] inorder) {
        int n=inorder.length;
        return helper(preorder,0,n-1,inorder,0,n-1);
    }
}