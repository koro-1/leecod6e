import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlatesBetweenCandles {
    public int[] platesBetweenCandles(String s, int[][] queries) {

        int num[]=new int[queries.length];

        for (int i = 0; i < num.length; i++) {
            int l=queries[i][0];
            int f=queries[i][1];
            num[i]=howmany(s.substring(l,f+1));
        }
        return num;

    }
    int howmany(String s){

        boolean le = false,right= false;
        int l=0,f=s.length()-1;
        int sum=0;


        while (!(le&&right)&&l<f){
            if (s.charAt(l)=='|') le=true;
            if (s.charAt(f)=='|') {
                right = true;

            }
            if(le&&right) break;


            if (s.charAt(l)!=s.charAt(f)&&s.charAt(l)=='|')
                f--;
            else  if (s.charAt(l)!=s.charAt(f)&&s.charAt(f)=='|')
                l++;

            else{
                l++;
                f--;
            }

        }
        if (l>=f) return sum;





        for (int i = l; i <=f ; i++) {
            if (s.charAt(i)=='*')sum++;
        }
        return sum;




    }

    public static void main(String[] args) {
       //"***|**|*****|**||**|*"
        //[[1,17],[4,5],[14,17],[5,11],[15,16]]
      int arr[][]=new int[][]{{100,164}/*,{4,5},{14,17},{5,11},{15,16}*/};
        System.out.println(Arrays.toString(new PlatesBetweenCandles().platesBetweenCandles("**|*******************|**********************************************|************|*********|*****|*********************************************************************************************|***", arr)));

    }

}
