import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {

    public int[][] solveNQueens(int n) {
         int arrs[][]=new int[n][n];
        for (int i = 0; i <n ; i++) {
              arrs[0][i]=1;
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(Arrays.toString(arrs[n]));
        }







        return new int[4][4];
    }
   static int confict(int m,int n,int nums[][],boolean flag[][]){
         int sum=0;  int len=nums.length;
        for (int i = 0; i <len ; i++) {


            for (int j = 0; j <len ; j++) {

                if (nums[m][i]==1&& !flag[m][i]) {
                    sum++;System.out.println("x i="+i+"j="+j);
                    flag[m][i]=true;
                }
                if (nums[i][n]==1&& !flag[i][n]) {
                    System.out.println("x i="+i+"j="+j);
                    sum++;
                    flag[i][n]=true;
                }
                if ((-i+j==-m+n||i+j==m+n)&&nums[i][j]==1) {
                    sum++;
                    System.out.println("x i="+i+"j="+j);
                }






            }
        }





        return sum;
    }

    public static void main(String[] args) {
        int n=16;
        List<List<Integer>>lists=new ArrayList<>();
        int arrs[][]=new int[n][n];
        /*int arrs2[][]= {{0, 0, 0, 0, 0, 0, 1, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0, 0, 0}};
        System.out.println(        confict(4,7,arrs2,new boolean[8][8])
        );*/        for (int i = 0; i <n ; i++) {
            arrs[0][i]=1;
        }

        for (int i = 0; i <n ; i++) {
            System.out.println(Arrays.toString(arrs[i]));
        }

         int min=1000,minx = 0,miny = 0;
        for (int i = 0; i <n ; i++) {
            min=1000;int confir=0;
            arrs[0][i]=0;

            for (int j = 0; j <n ; j++) {

                  if (confict(j,i,arrs,new boolean[n][n])<min){

                   min=confict(j,i,arrs,new boolean[n][n]);
                       minx=j;
                       miny=i;


                  }


            }

            arrs[minx][miny]=1;


        }
        List<List<Integer>> listTest = new ArrayList<List<Integer>>();
        for (int i = 0; i < arrs.length; i++) {
            List<Integer> columnList = new ArrayList<Integer>();
            for (int j = 0; j < arrs[i].length; j++) {

                columnList.add(j, arrs[i][j]);

            }
            listTest.add(i, columnList);
        }


    }


}
