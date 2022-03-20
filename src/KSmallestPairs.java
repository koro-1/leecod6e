import java.util.*;

public class KSmallestPairs {

   static boolean flag = true;
  static   public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums1.length, m = nums2.length;
        if (n > m && !(flag = false)) return kSmallestPairs(nums2, nums1, k);
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b)->(nums1[a[0]]+nums2[a[1]])-(nums1[b[0]]+nums2[b[1]]));
        for (int i = 0; i < Math.min(n, k); i++) q.add(new int[]{i, 0});

        while (ans.size() < k && !q.isEmpty()) {
            int[] poll = q.poll();
            int a = poll[0], b = poll[1];
            ans.add(new ArrayList<Integer>(){{
                add(flag ? nums1[a] : nums2[b]);
                add(flag ? nums2[b] : nums1[a]);
            }});
            if (b + 1 < m) q.add(new int[]{a, b + 1});
        }
        return ans;
    }

    Map<Integer,Integer>map=new HashMap<>();
   private void count (int[]nums){

     map.put(nums[0],1);
       for (int i = 1; i <nums.length ; i++) {
           if (!map.containsKey(nums[i])) map.put(nums[i],1);
           else map.put(nums[i],map.get(nums[i])+1);
       }


   }
    public int countElements(int[] nums) {

      int l=0;
        Arrays.sort(nums);
       count(nums);
       List<Integer>list=new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) list.add(num);
        }

        for (int i = 1; i < list.size()-1; i++) {
            if (map.get(list.get(i-1))>=1&&map.get(list.get(i+1))>=1)
                l=l+map.get(list.get(i));

        }

       return l;
      }





    public static void main(String[] args) {
        /*          int num1[]={1,1,2,3},num2[]={1,2,3};
        System.out.println(kSmallestPairs(num1,num2,3));*/
        System.out.println(new KSmallestPairs().countElements(new int[]{-71,-71,93,-71,40}));

  }

}
