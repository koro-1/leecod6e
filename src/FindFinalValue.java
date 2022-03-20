import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFinalValue {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        List<Integer>list=new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        while (list.contains(original)){

         original=original*2;




        }
        return original;
    }

    public static void main(String[] args) {
        System.out.println(new FindFinalValue().findFinalValue(new int[]{2,7,9},3));
    }
}
