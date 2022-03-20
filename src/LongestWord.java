import java.util.*;
import java.util.stream.Collectors;

public class LongestWord {


 static    public String longestWord(String[] words) {
     Arrays.sort(words);

     Set<String> set = new HashSet<>();
     String res = "";
     for (String s : words) {
         //如果单词只有一个字母，那一定是共有的
         if (s.length() == 1 || set.contains(s.substring(0, s.length() - 1))) {
             res = s.length() > res.length() ? s : res;
             set.add(s);
         }
     }
     return res;
    }



    public static void main(String[] args) {
        System.out.println(longestWord(new String[]{"m","mo","moc","moch","mocha","l","la","lat","latt","latt","c","ca","cat"}));

 }
}
