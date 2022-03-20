import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckPerfectNumber {
    public boolean checkPerfectNumber(int num) {

        List<Integer> list=new ArrayList<>();
        list.add(1);
        for (int i = 2; i <Math.sqrt(num); i++) {
            if (num/(i+0.0)%1==0) {
                list.add(i);
                list.add(num/i);
            }
        } int sum=0;
        for (Integer integer : list) {
            sum=sum+integer;
        }

        return num==sum;
    }

    public static void main(String[] args) {
        new CheckPerfectNumber().checkPerfectNumber(0);

    }
}
