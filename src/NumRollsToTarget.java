import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumRollsToTarget {
  private    int sum=0;
    public int numRollsToTarget(int n, int k, int target) {

       int arrays []=new int[k];
       boolean flag[]=new boolean[k];
       int shiyong[]=new int[k];


       List<Integer> list=new ArrayList<>();
        for (int i = 1; i <=k ; i++) {
            arrays[i-1]=i;
            shiyong[i-1]=0;

        }
        System.out.println(Arrays.toString(arrays));
          huisu(arrays,0,target,n,list,flag,shiyong);



 return  sum;
    }

    private  void huisu(int nums[],int size,int target,int length,List<Integer>list,boolean[]flag,int shiyong[]) {


           if (list.size()!=0&&list.get(list.size()-1)==target) {
               sum++;
               return;
           }

        for (int i = 0; i <nums.length ; i++) {
            if (flag[i]) break;
            list.add(nums[i]);
            shiyong[i]++;
            if (shiyong[i]==length) flag[i]=true;
            huisu(nums, size, target-nums[i], length, list, flag, shiyong);
            list.remove(list.get(list.size()-1));
            huisu(nums, size, target, length, list, flag, shiyong);

        }



    }

    public static void main(String[] args) {
        System.out.println(      new NumRollsToTarget().numRollsToTarget(1,6,6)
);
    }


}
