import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BalancedStringSplit {
    public int balancedStringSplit(String s) {

  //"RLRRLLRLRL"


        int a=0,b=0,c=0;
        for (int i = 0; i < s.length(); i++) {

           if (s.charAt(i)=='R') a++;
           else b++;
           if (a==b&&a!=0)c++;



        }
         return c;
    }

    public static void main(String[] args) {
        System.out.println(new BalancedStringSplit().balancedStringSplit("RLLLLRRRLR"));
    }
}
