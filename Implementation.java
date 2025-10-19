public class Implementation {
   public int size(Node root){
    if(root==null){
        return 0;
    }
    return 1+size(root.left)+size(root.right);
   }
   public int maxValue(Node root){
    if(root==null){
        return Integer.MIN_VALUE;
    }
    return Math.max(root.val, Math.max(maxValue(root.left), maxValue(root.right)));
   }
   public int MinValue(Node root){
    if(root==null)
    {
        return Integer.MAX_VALUE;
    }
    return Math.min(root.val, Math.min(MinValue(root.left), MinValue(root.right)));
   }
   public int totalSum(Node root){
       if(root==null){
        return 0;
       }
       return root.val+totalSum(root.left)+totalSum(root.right);
   }
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
   public int productOfAllNodes(Node root){
       if(root==null){
           return 1;
       }
       return root.val*productOfAllNodes(root.left)*productOfAllNodes(root.right);
   }

    public void printNode(Node  root)
    {
        if(root==null)
        {
            return ;

        }
        System.out.print(root.val);
        System.out.print("-> ");
        if(root.left!=null)
        {
            System.out.print(root.left.val);
        }
        else
        {
            System.out.print("null");
        }
        System.out.print(", ");
        if(root.right!=null)
        {
            System.out.print(root.right.val);
        }
        else
        {
            System.out.print("null");
        }
        System.out.println();
        printNode(root.left);
        printNode(root.right);
    }

      public void inOrderTraversal(Node root){
        if(root==null){
            return ;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
      }
      public void preOrderTraversal(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

      }
      public void postOrderTraversal(Node root){
        if(root==null){
            return ;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
      }

      public void printElement(Node root,int level,int levelToPrint){
        if(root==null){
            return ;
        }
        if(level==levelToPrint){
            System.out.print(root.val+" ");
            return ;
        }
        printElement(root.left,level+1,levelToPrint);
        printElement(root.right,level+1,levelToPrint);
      }

public static void main(String [] args){

    Node a =new Node(1);
    Node b =new Node(2);
    Node c =new Node(3);
    a.left = b;
    a.right = c;
    Node d=new Node(4);
    Node e=new Node(5);
    b.left=d;
    b.right=e;
    Node f=new Node(6);
    c.right=f;
    Implementation impl = new Implementation();
    impl.printNode(a);
    System.out.println("Size of tree: "+impl.size(a));
    System.out.println("Max value in tree: "+impl.maxValue(a));
    System.out.println("Min value in tree: "+impl.MinValue(a));
    System.out.println("Total Sum of all the tree is "+impl.totalSum(a));
    System.out.println("Height of tree is : "+impl.height(a));
    System.out.println("Product of all nodes in tree is : "+impl.productOfAllNodes(a));
    System.out.print("Inorder Traversal: ");
    impl.inOrderTraversal(a);
    System.out.println();
    System.out.print("Preorder Traversal: ");
    impl.preOrderTraversal(a);
    System.out.println();
    System.out.print("Postorder Traversal: ");
    impl.postOrderTraversal(a);
    System.out.println();
    System.out.print("Print elements at level : ");
    impl.printElement(a, 0, 1);
}

}
