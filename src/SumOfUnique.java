import java.util.*;

public class SumOfUnique {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();


        int ans=0; //1 2 2 3 1 2
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1)ans=ans+entry.getKey();
        }
        System.out.println(ans);
        return  ans;
    }

    public static void main(String[] args) {
        new SumOfUnique().sumOfUnique(new int []{1,2,2,3,1,2});
    }
}
