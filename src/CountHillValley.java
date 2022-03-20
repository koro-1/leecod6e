import java.util.ArrayList;
import java.util.List;

public class CountHillValley {

  static   public int countHillValley(int[] nums) {
      int sum=0;boolean flag=false;
        List<Integer> list=new ArrayList<>();
             list.add(nums[0]);
        for (int i =1; i < nums.length; i++) {
           if (nums[i]==nums[i-1]) flag=true;
           else flag=false;
            if (!list.contains(nums[i])||!flag)
          list.add(nums[i]);

        }
      for (int i = 1; i < list.size()-1; i++) {
           if (list.get(i)>list.get(i-1)&&list.get(i)>list.get(i+1))sum++;
           if (list.get(i)<list.get(i-1)&&list.get(i)<list.get(i+1))sum++;
      }

        System.out.println(list);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countHillValley(new int[]{5,7,7,1,7}));
    }

}
