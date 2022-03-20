import java.util.*;

class Tree{
   static public Integer[] levelOrder(TreeNode root) {

       List<Integer> list=new ArrayList<>();
       Queue<TreeNode> queue=new ArrayDeque<>();
       queue.add(root);
       while (!queue.isEmpty()){
           TreeNode cur=queue.poll();
           list.add(cur.val);
           if (cur.left!=null) queue.add(cur.left);
           if (cur.right!=null) queue.add(cur.right);




       }
       return list.toArray(new Integer [list.size()]);






    }
    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x,TreeNode l,TreeNode r) { val = x;
           left=l;
            right=r;}
        TreeNode(int x) { val = x;

            }

    }


    public static void main(String[] args) {
       /* System.out.println(Arrays.toString(levelOrder(new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7))))));*/
    new Tree().levelOrder2(new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7))));
   }
    Map<Integer,List<Integer>>map=new HashMap<>();
    public List<List<Integer>> levelOrder2(TreeNode root) {
       digui(0,root);
        List<List<Integer>>lists=new ArrayList<>();
        for (int i = 0; i < map.size(); i++) {
            lists.add(map.get(i));
        }
        System.out.println(lists);
       return  null;
    }
    void digui(int n,TreeNode root){
        if ( root==null) return;
        List<Integer>list=map.getOrDefault(n,new ArrayList<>());
        list.add(root.val);
        map.put(n,list);
        digui(n+1,root.left);
        digui(n+1,root.right);

    }
}