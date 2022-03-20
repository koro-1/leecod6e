import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class CuntKDifference {
   static public int countKDifference() {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(); int k=scanner.nextInt();
        int nums[] =new int[n];
        int[] sum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            nums[i-1]=scanner.nextInt();
            sum[i]=(sum[i-1]+nums[i-1])%k;
        }
       System.out.println(Arrays.toString(sum));

       int l=1,f=sum.length-1;
                 int sums=0;
                 while (l<=f){

                     int r=l,q=f;
                      while (r<q||(r==q&&sum[r]==0)){

                       if (sum[r]==sum[q]) sums++;

                       q--;
                      }
                     l++;





                 }
                 return sums;
    }

    public static void main(String[] args) {



        System.out.println(countKDifference());
    }
}
