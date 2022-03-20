/*
import java.util.*;

public class LargestSumAfterKNegations {

  static   public int largestSumAfterKNegations(int[] nums, int k) {
       int len =nums.length;
      Map<Integer,Integer>map=new HashMap<>();
      for (int i = 0; i <len ; i++) {
           if (nums[i]<0){
               map.put(i,nums[i]);
           }
      }
      List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());


      // 下面的也可以写成lambda表达式这种形式
      // Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
      Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
          @Override
          public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
              return o1.getValue().compareTo(o2.getValue()); // 这里改为根据value值进降序排序，这里也可以改成根据key和value进行排序
          }
      });
      System.out.println(list);
      for (int i = 0; i <k ; i++) {
          if (map.size()==0) break;
          nums[list.get(i).getKey()]*=-1;
          if (list.size()-1<=i) break;
      }

      Arrays.sort(nums);
      int z=k-map.size();
      System.out.println(z);
      */
/*for (int i =0; i <len&&z>0 ; i++,z--) {


      }*//*

      if (z>0&&z%2!=0&&nums[0]!=0)
          nums[0]*=-1;


      System.out.println(Arrays.toString(nums));

           int sum=0;
      for (int a:nums
           ) {
          sum=sum+a;
      }

        return sum;
    }
    int sums(int x,int y) {
        int s = 0,b=0;
        while (x != 0) {
            s += x % 10;
            x = x / 10;
        }
        while (y != 0) {
            b += y % 10;
            y = y / 10;
        }
        return s+b;

    }

    public static void main(String[] args) {
        int nums []={-3,-2,2,0,5};
        System.out.println(      largestSumAfterKNegations(nums,3)
        );    }
}
*/
