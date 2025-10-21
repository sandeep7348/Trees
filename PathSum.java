class PathSum{
   boolean calculateAns(Node root,int targetSum)
   {

    if(root==null)
    {
        return false;
    }
    if(root.left==null && root.right==null)
    {
        return targetSum==root.val;
    }
    return calculateAns(root.left,targetSum-(root.val))||calculateAns(root.right,targetSum-(root.val));

   }
    boolean hasPathSum(Node root, int targetSum) {
        
        if(root==null  )
        {
            return false;
        }
        
        return calculateAns(root,targetSum);
    }
}
