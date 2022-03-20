import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOcurrences {



       static    public String[] findOcurrences(String text, String a, String b) {
            String[] ss = text.split(" ");
           for (String s : ss) {
               System.out.println(s);
           }
            int n = ss.length;
            List<String> list = new ArrayList<>();
            for (int i = 0; i + 2 < n; i++) {

                if (ss[i].equals(a) && ss[i + 1].equals(b)) list.add(ss[i + 2]);

            }

            return list.toArray(new String[list.size()]);
        }




    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOcurrences("alice is a good girl she is a good student","a","good"))
        );
    }

}
