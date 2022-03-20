import java.util.*;

public class findLHS {


   /*static int pd(int []nums,int l,int f){

        Map<Integer,Integer>map=new HashMap<>();
        for (int i =l; i <=f ; i++) {
            if (map.containsKey(nums[i]))continue;
            map.put(nums[i],1);
        }
        for (int i = l; i <f ; i++) {
           int c=nums[i];
            if (map.containsKey(nums[i]+1))
                map.put(nums[i]+1,map.get(nums[i]+1)+1);
            if (map.containsKey(nums[i]-1))
                map.put(nums[i]-1,map.get(nums[i]-1)+1);

        }
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());


        // 下面的也可以写成lambda表达式这种形式
        // Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue()); // 这里改为根据value值进降序排序，这里也可以改成根据key和value进行排序
            }
        });
          return list.get(0).getValue();
    }


    public static int findLHS( int []nums) {

        int [][]dp=new int[nums.length+1][nums.length+1];

        for (int i = 1; i <=nums.length ; i++) {
            for (int j = i; j <=nums.length ; j++) {
                if (i==j)dp[i][j]=0;

               *//* if (M)*//*


            }
        }




         return dp[nums.length][nums.length];
    }

    public static void main(String[] args) {
         int []nums={3,2,2,3,3};
        System.out.println(pd(nums,0,nums.length-1));
        *//*System.out.println(findLHS(nums));*//*

    }*/
}
