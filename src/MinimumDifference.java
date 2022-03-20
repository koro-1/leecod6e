import java.util.Arrays;

public class MinimumDifference {


    public int minimumDifference(int[] nums, int k) {

        Arrays.sort(nums);
       int min=Integer.MAX_VALUE;
        for (int i = 0; i+k<=nums.length ; i++) {

            min=Math.min(min,nums[i+k-1]-nums[i]);

        }

     return min;

    }

    public static void main(String[] args) {
        System.out.println(new MinimumDifference().minimumDifference(new int[]{8,4,1,7}, 2));
    }

}
