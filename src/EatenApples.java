import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class EatenApples {
  static   public int eatenApples(int[] apples, int[] days) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b)->a[0]-b[0]);
        int n = apples.length, time = 0, ans = 0;
        while (time<n||!q.isEmpty()){

            if (time<n&&apples[time]>0) q.add(new int[]{time+days[time]-1,apples[time]});

            while (!q.isEmpty()&&q.peek()[0]<time) q.poll();

          if (!q.isEmpty()){


              int []cur=q.poll();

              if (--cur[1]>0&&cur[0]>time) {



                  q.add(cur);
              }
              ans++;
          }
          time++;

            }








        return ans;
    }

    public static void main(String[] args) {
         int [] apples={1},days={2};
      /*  PriorityQueue<int[]> q = new PriorityQueue<>((a, b)->a[1]-b[1]);
        q.add(new int[]{1,1});
        q.add(new int[]{3,21});
        q.add(new int[]{2,12});
        q.add(new int[]{4,111});
         while (q.size()>0){

             System.out.println(q.poll()[0]);

         }*/


        System.out.println(eatenApples(apples,days));
    }
}
