
class BalanceBinaryTree {
    public int height(Node root){
      if(root==null){
        return 0;
      }
      if(root.left==null && root.right==null){
        return 0;
      }
      int left=1+height(root.left);
      int right=1+height(root.right);
      return Math.max(left,right);

   }
    public boolean isBalanced(Node root) {
       if(root==null)
       {
        return true;
       }
        int lh=height(root.left);
        if(root.left!=null)
        {
            lh++;
        }
        int rh=height(root.right);
        if(root.right!=null)
        {
            rh++;
        }
        int d=lh-rh;
        if(d<0) d=d*-1;
        if(d>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}