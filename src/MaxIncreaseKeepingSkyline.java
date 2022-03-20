import java.math.BigInteger;

public class MaxIncreaseKeepingSkyline {

   static public int maxIncreaseKeepingSkyline(int[][] grid) {

           int n = grid.length;
           int[] maxR = new int[n];
           int[] maxC = new int[n];
           for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                   maxR[i] = Math.max(maxR[i], grid[i][j]);
                   maxC[i] = Math.max(maxC[i], grid[j][i]);
               }
           }
           int ans = 0;
           for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                   ans += Math.min(maxR[i], maxC[j]) - grid[i][j];
               }
           }
           return ans;
       }


    public static void main(String[] args) {

      /*  int grid [][]={{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(maxIncreaseKeepingSkyline(grid));*/
        BigInteger a=BigInteger.valueOf(2);
        BigInteger b=BigInteger.valueOf(2);
        BigInteger c=BigInteger.valueOf(3);
        BigInteger d=BigInteger.valueOf(3);
        System.out.println(a.multiply(b).subtract(c.multiply(d)));


   }

}
