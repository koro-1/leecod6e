import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSubsequence {


   static public List<Integer> minSubsequence(int[] nums) {
       Arrays.sort(nums);
         List<Integer>list=new ArrayList<>();
       for (int i = nums.length; i >0 ; i--) {
           int a=sums(i-1,nums.length,nums);
           int b=sums(0,i-1,nums);
           list.add(nums[i-1]);
         if (a>b) {

          break;
         }



       }



        return list;
    }

    private static Integer sums(int i, int i1,int []nums) {
        int sum=0;
       for (int j = i; j <i1 ; j++) {
            sum+=nums[j];
        }
        return sum;
   }

    public static void main(String[] args) {
        System.out.println( minSubsequence(new int[]{1,2,3,4,5,6}));
        /*Integer sums = sums(0, 2, new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(sums);*/
    }
}
