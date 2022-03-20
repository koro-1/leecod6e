import java.util.ArrayList;
import java.util.List;

public class LastRemaining {
    static public int lastRemaining(int n) {
        int flag = 0;
        int arr[] = new int[n + 1];
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {

            list.add(i);
        }

        while (list.size() > 1) {
            int s = list.size() - 1;
            if (flag % 2 == 0) {
                int l = 0;
                while (l <= s) {

                    list.remove(l);
                    l = l + 2;
                    s = list.size() - 1;
                }

            } else {
                s = list.size() - 1;
                while (s > 0) {
                    list.remove(s);
                    s = s - 2;
                }


            }
            flag++;
        }
        System.out.println(list);
        return 0;
    }

    static public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) return new int[][]{};
        int[][] answer = new int[m][n];
        int flag = 1;
        int row = 0;
        for (int i = 0; i < original.length; i++) {
            if (i % n == 0 && i > 0) row++;
            answer[row][i % n] = original[i];


        }


        return answer;
    }
     static    public int maxValue(TreeNode root, int k) {
            int[] dp = dynamic(root, k);
            int max = Integer.MIN_VALUE;
            for (int i = 0; i <= k; i++) {
                //取root的各种染色情况的最大值
                max = Math.max(max, dp[i]);
            }
            return max;
        }

      static   private int[] dynamic(TreeNode root, int k) {
            int[] dp = new int[k + 1];
            //1.初始化：空节点为底，自底向上
            if (root == null) return dp;
            //2.获取左、右子树染色状态的dp表
            //- 左子树
            int[] l = dynamic(root.left, k);
            //- 右子树
            int[] r = dynamic(root.right, k);
            //3.更新处理root 染色/不染色 的情况下的dp表
            //- 不染root
            int ml = Integer.MIN_VALUE, mr = Integer.MIN_VALUE;
            for (int i = 0; i <= k; i++) {
                //- 分别取子节点的最大值
                ml = Math.max(ml, l[i]);
                mr = Math.max(mr, r[i]);
            }
            dp[0] = ml + mr;
            //- 染root
            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < i; j++) {
                    //- 还需要染色 i - 1 个点，左子树 j 个，右子树 i-1-j 个
                    dp[i] = Math.max(dp[i], root.val + l[j] + r[i - 1 - j]);
                }
            }
            //4.更新完毕，返回后继续向上动态规划
            return dp;
        }


    public static void main(String[] args) {
        /* lastRemaining(10);*/
        /*for (int[] ints : construct2DArray(new int[]{1, 2}, 1, 1)) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }*/

    }
}