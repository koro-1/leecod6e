import java.util.Arrays;

public class findRepeatNumber {

    public int findRepeatNumber(int[] nums) {

         Arrays.sort(nums);
         int i=1;
        for (int j = 1; j <nums.length ; j++) {
               if (nums[j-1]==nums[j])
                   return nums[j];


        }



          return 0;
    }

    public static void main(String[] args) {
        int nums[]={8,2,1,7,8,3};
        System.out.println(        new findRepeatNumber().findRepeatNumber(nums)
        );
    }


}
