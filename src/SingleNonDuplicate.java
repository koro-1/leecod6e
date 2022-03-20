public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        int l=0,r = nums.length-1,m;
        while(l<r){
            m=l+(r-l)/2;
            if (m%2==1){
                m--;
            }
            if(nums[m]==nums[m+1]){
                l=m+2;
            }else{
                r=m;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        System.out.println(new SingleNonDuplicate().singleNonDuplicate(new int[]{1,1,3,3,4,4,2,5,5}));
    }
}
