import java.util.*;

public class MaxScoreIndices {
    public List<Integer> maxScoreIndices(int[] nums) {


        int dp[][]=new int[nums.length+1][2];
        int one_num=0;
        for (int num : nums) {
            if (num==1) one_num++;
        }
        dp[0][0]=0; dp[0][1]=one_num;
        int max=one_num;int dex=0;
        List<Integer>list=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();

        for (int i = 1; i <=nums.length ; i++) {
            if (nums[i-1]==0) {
                dp[i][0] = dp[i - 1][0] + 1;
                dp[i][1] = dp[i - 1][1];
            }else {
                dp[i][0] = dp[i - 1][0];
                dp[i][1] = dp[i - 1][1]-1;
            }

            max=Math.max(max,dp[i][0]+dp[i][1]);

        }
        for (int i = 0; i <nums.length+1 ; i++) {
            if (dp[i][0]+dp[i][1]==max)list.add(i);
        }


     return list;
    }

    public static void main(String[] args) {
        System.out.println(new MaxScoreIndices().maxScoreIndices(new int[]{0,0,1,0}));
    }
}
