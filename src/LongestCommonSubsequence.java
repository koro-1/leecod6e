public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {

        int len1=text1.length(),len2=text2.length();
        int dp[][]=new int[len1+1][len2+1]; //dp[i][j]指第一个字符串前i个字符和第两个字符串前j个的最大字符串
        for (int i =1; i <=len1 ; i++) {
            for (int j =1; j <=len2; j++) {
                if (text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                    else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);



            }
        }
         return dp[len1][len2];




    }

    public static void main(String[] args) {

        System.out.println( new LongestCommonSubsequence().longestCommonSubsequence("aasd","aad"));

    }

}
