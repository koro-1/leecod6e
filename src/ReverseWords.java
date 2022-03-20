import java.util.Arrays;

public class ReverseWords {


    public static void main(String[] args) {
         String s="a good   example";
         String s1="  i am li hua";
         String []ss=s.trim().split(" ");
        System.out.println(ss.length);
         StringBuilder stringBuilder=new StringBuilder();
        for (int i =ss.length-1; i >=0 ; i--) {
            if (!ss[i].equals("")) {
                stringBuilder.append(ss[i]);
                if (i != 0) stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
