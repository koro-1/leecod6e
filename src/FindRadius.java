import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindRadius {

  static   public int findRadius(int[] houses, int[] heaters) {
       int max1=Integer.MAX_VALUE;
      Arrays.sort(houses);
      Arrays.sort(heaters);
     /* int hi = 0, max = 0;
      for (int house : houses) {
          int d = Math.abs(heaters[hi] - house);
          int next;
          while (hi < heaters.length - 1 && (next = Math.abs(heaters[hi + 1] - house)) <= d) {
              ++hi;
              d = next;
          }
          if (d > max) max = d;
      }
      return max;*/
      List<Integer> list=new ArrayList<>();
      for (int i = 0; i < houses.length; i++) {

          for (int i1 = 0; i1 < heaters.length; i1++) {
              max1=Math.min(max1,Math.abs(houses[i]-heaters[i1]));


          }
          list.add(max1);
          max1=Integer.MAX_VALUE;

      }
      System.out.println(list);




      return Collections.max(list);
    }

    public static void main(String[] args) {
       int num[]={1,1,1,1,1,1,999,999,999,999,999}; int num2[]={499,500,501};
        System.out.println(      findRadius(num,num2)
        );

    }


}
