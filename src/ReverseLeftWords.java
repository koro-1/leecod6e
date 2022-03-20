public  class ReverseLeftWords {


 static    public boolean canJump(int[] nums) {

     int len =nums.length; int max=0;
     for (int i =0; i <=nums.length-1 ; i++) {
         if (max<i)return false;
         max=Math.max(max,i+nums[i]);

         if (max>=nums.length-1)return true;

     }

     return false;
 }
    public static void main(String[] args) {
        int nums[]={2,3,1,0,0,4};int max=0;
        System.out.println(canJump(nums));


    }
}
