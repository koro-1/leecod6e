import java.util.Arrays;
import java.util.Collections;

public class NumFriendRequests  {

    public int numFriendRequests(int []ages){

          int num=0;
          Arrays.sort(ages);



        for (int i = 0; i < ages.length; i++) {
            for (int i1 = i+1; i1 < ages.length; i1++) {
                if (check(ages,i,i1)&&ages[i]==ages[i1]) num=num+2;
               else if (check(ages,i,i1)) num++;
            }
        }

       return num;
    }

    public  void sort(int[] arr) {
        int length = arr.length;
        //区间
        int gap = 1;
        while (gap < length) {
            gap = gap * 3 + 1;
        }
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                int tmp = arr[i];
                int j = i - gap;
                //跨区间排序
                while (j >= 0 && arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = tmp;
            }
            gap = gap / 3;
        }
    }


    static boolean check(int ages[],int x, int y){

       if (ages[y] <= 0.5 * ages[x] + 7||ages[y] > ages[x]||ages[y] > 100 && ages[x] < 100)
           return false;
          return true;
    }

    public static void main(String[] args) {
        int[] ints = {16,17,18};
        Arrays.sort(ints);
        System.out.println(    Arrays.toString(ints)     );
        System.out.println(new NumFriendRequests().numFriendRequests(new int[]{16,16,16})
        );
    }



}
