import java.util.*;
import java.util.Comparator;

public class CountQuadruplets {
    List<List<int[]>> res=new ArrayList<>();
      int num=0;
    public int countQuadruplets(int[] nums) {
        List<int []>list=new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(new int[]{i,nums[i]});
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1]-o1[1];
            }
        });
        System.out.println(Arrays.toString(list.get(0)));
        System.out.println(Arrays.toString(list.get(1)));
        System.out.println(Arrays.toString(list.get(2)));
        System.out.println(Arrays.toString(list.get(3)));
        System.out.println(Arrays.toString(list.get(4)));
        for (int i = 0; i <list.size()-4; i++) {
            huisu(list,new ArrayList<>(),3,i+1);
        }
          return num;
    }

    private void huisu(List<int[]> list,List<int[]> path,int target,int len) {
        if (target == 0) {
           num++;
            return;
        }
        for (int i = len; i <list.size() ; i++) {
            path.add(list.get(i));
            huisu(list,path,target-list.get(i)[0],len+1);

        }


    }

    public static void main(String[] args) {
        System.out.println(new CountQuadruplets().countQuadruplets(new int []{1,1,1,3,5}));
    }

}
