public class FindPoisonedDuration {


    public int findPoisonedDuration(int[] timeSeries, int duration) {
             //1,3  3
          int sum=0; int num=0;
           int []dp=new int[timeSeries.length+1];
           //dp[i]表达第i次攻击后中毒时间

        dp[1]=duration;
        for (int i = 2; i <=timeSeries.length ; i++) {
            if ((timeSeries[i-1]-timeSeries[i-2])>duration)
                dp[i]=dp[i-1]+duration;
            else dp[i]=dp[i-1]+timeSeries[i-1]-timeSeries[i-2];
        }







        return dp[timeSeries.length];
    }

    public static void main(String[] args) {
        int num[]={1,3};
        System.out.println(new FindPoisonedDuration().findPoisonedDuration(num,3));
    }
}
