public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
                   TreeNode t1,t2;
                  if (root==null) return null;


                 /* if (root.val==q.val&&(p.val==root.left.val||root.right.val==p.val))
                      return root;
                  if (root.val==p.val&&(q.val==root.left.val||root.right.val==q.val))
                      return root;*/

                 if ((dfs(root.left,q)&&dfs(root.right,p))||(dfs(root.left,p)&&dfs(root.right,q))||(dfs(root,p)&&dfs(root.right,q))||(dfs(root,p)&&dfs(root.left,q))||(dfs(root.left,p)&&dfs(root,q))||(dfs(root.right,p)&&dfs(root,q)))
                      if (lowestCommonAncestor(root.left,p,q)!=null) return lowestCommonAncestor(root.left,p,q);
                      else if (lowestCommonAncestor(root.right,p,q)!=null) return lowestCommonAncestor(root.right,p,q);
                     else return root;
                 else  {
                   t1=lowestCommonAncestor(root.left,p,q);
                   t2 = lowestCommonAncestor(root.right,p,q);



                 }



      if (t1==null)return t2;
      else return t1;


    }
       Boolean dfs(TreeNode root,TreeNode key){
               if (root==null)return false;

               if (root.val==key.val) return true;
               else return dfs(root.left,key)||dfs(root.right,key);


       }

    public static void main(String[] args) {

   TreeNode treeNode=     new TreeNode(3,new TreeNode(5,new TreeNode(6),new TreeNode(2,new TreeNode(7),new TreeNode(4))),new TreeNode(1,new TreeNode(0),new TreeNode(8)));
        System.out.println(         new LowestCommonAncestor().lowestCommonAncestor(treeNode,new TreeNode(4),new TreeNode(6))
        .val);
        System.out.println(new LowestCommonAncestor().dfs(treeNode.left.right,new TreeNode(4))&&new LowestCommonAncestor().dfs(treeNode.left.left,new TreeNode(6)));

     }


}

