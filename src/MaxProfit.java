class SuperPow {

    static public int maxProfit(int[] prices) {

        int l = 0, r = prices.length - 1;
        int max = 0;
        while (l <= r) {
            if (prices[l] > prices[r]) l++;
            else {
                max = Math.max(max, prices[r] - prices[l]);
                r--;

            }


        }
        l=0;r=prices.length-1;
        while (l <= r) {
            if (prices[l] > prices[r]) {
                r--;
                max = Math.max(max, prices[r] - prices[l]);

            }
            else {
                max = Math.max(max, prices[r] - prices[l]);
                l++;

            }


        }

     return max;
    }

    public static void main(String[] args) {
        int nums[]={3,2,6,5,0,3};
        System.out.println(maxProfit(nums));
    }
}