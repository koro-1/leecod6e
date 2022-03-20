import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class IsEvenOddTree {

    static class TreeNode{
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }




    }

 static   Map<Integer, Integer> map = new HashMap<>();
    static   public boolean isEvenOddTree(TreeNode root) {
        return dfs(root, 0);
    }
  static   boolean dfs(TreeNode root, int idx) {
        boolean flag = idx % 2 == 0;
        int prev = map.getOrDefault(idx, flag ? 0 : 0x3f3f3f3f), cur = root.val;
        if (flag && (cur % 2 == 0 || cur <= prev)) return false;
        if (!flag && (cur % 2 != 0 || cur >= prev)) return false;
        map.put(idx, root.val);
        if (root.left != null && !dfs(root.left, idx + 1)) return false;
        if (root.right != null && !dfs(root.right, idx + 1)) return false;
        return true;
    }



    public static void main(String[] args) {
        System.out.println(        isEvenOddTree(new TreeNode(1,new TreeNode(6),new TreeNode(4)))
);
    }



}
