import java.util.ArrayList;
import java.util.List;

public class ww {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("12");
        list.add("13");
        String ss[]= list.toArray(new String[0]);

        for (String s : ss) {
            System.out.println(s);
        }

            }

}
