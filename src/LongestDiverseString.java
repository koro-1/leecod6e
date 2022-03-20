import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LongestDiverseString {
    Map<String,Integer>map=new TreeMap<>();
    public String longestDiverseString(int a, int b, int c) {
        map.put("a",a);
        map.put("b",b);
        map.put("c",c);
        while (map.entrySet().iterator().hasNext()){

            System.out.println(map.entrySet().iterator().next());

        }

            return "";
    }

    public static void main(String[] args) {
         new LongestDiverseString().longestDiverseString(2,3,1);
    }
}
