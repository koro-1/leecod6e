import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArray {

   static public int[] rearrangeArray(int[] nums) {
        List<Integer> l=new ArrayList<>();
        List<Integer> f=new ArrayList<>();

        for (int num : nums) {
             if (num > 0) l.add(num);
             else f.add(num);
        }

       for (int i = 0; i <=nums.length-2; i=i+2) {
           nums[i]=l.get((i/2));
           nums[i+1]=f.get((i/2));
       }System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
        rearrangeArray(new int[]{-1,1});
    }
}
