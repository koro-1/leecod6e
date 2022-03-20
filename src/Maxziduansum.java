public class Maxziduansum {

    int Maxziduansum(int []arrs){
        int len=arrs.length;      //-2,11,-4,-13,-5,-2
        int dp[]=new int[len+1]; //d[i]表示前i个字段的最大字段和
        int sum=0;
        int max=0;
        for (int i =1; i <=len ; i++) {

            sum=sum+arrs[i-1];
            if (sum<0)sum=0;
            max=Math.max(max,sum);
            dp[i]=max;


        }


        return max;
    }

    public static void main(String[] args) {
        int arrs[]={-2,11,-4,13,-5,-2};
        System.out.println(        new Maxziduansum().Maxziduansum(arrs)
        );

    }


}
