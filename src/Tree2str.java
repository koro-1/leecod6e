import java.util.ArrayList;
import java.util.List;

public class Tree2str {

    StringBuilder sb=new StringBuilder();
    public String tree2str(TreeNode root) {


        List<Integer> list=new ArrayList<>();
        int num;

       
        if (root==null) {

            return "";
        }
        sb.append(root.val);
        if (!(root.right==null&&root.left==null))
        {
            sb.append("(");
            tree2str(root.left);
            sb.append(")");
        }

        if (root.right!=null){
            sb.append("(");
            tree2str(root.right);
            sb.append(")");
        }







        return sb.toString();
    }

   String add(String s){

        s="("+s+")";

  return s;

   }

    public static void main(String[] args) {
        System.out.println(new Tree2str().tree2str(new TreeNode(1, new TreeNode(2,null,new TreeNode(4)), new TreeNode(3))));
    }
}
