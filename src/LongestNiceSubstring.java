import java.util.*;

public class LongestNiceSubstring {
   static public String longestNiceSubstring(String s) {
        int max=0;
        Map<Character,Integer>map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),i);
        }
       System.out.println(s);
       System.out.println(map);
       List<Character>list=new ArrayList<>();
       for (int i = 0; i < s.length(); i++) {
           for (int i1 = i; i1 < s.length(); i1++) {
               int add=0;
                    char c=s.charAt(i1);
                   if (Character.isLowerCase(c)){
                       if (map.get((Object)(Character.toUpperCase(c)))<i1){
                           break;
                       }

                   }else
                   {
                       if (map.get((Object)(Character.toLowerCase(c)))<i1){
                           break;
                       }
                   }

                     list.add(c);
                     if (list.contains((char)(c+32))||list.contains((char)(c-32))){

                         list.remove((Object)(Character.toLowerCase(c)));
                         list.remove((Object)(Character.toUpperCase(c)));
                         if (list.size()==0) add=add+i1-i+1;

                     }


                     max=Math.max(max,add);
           }
       }
         return ""+max;
    }

    public static void main(String[] args) {
       /* System.out.println(longestNiceSubstring("dDzeE"));*/
       String s="AdDzeE";
        Map<Character,Integer>map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
           map.put( s.charAt(i),1);
        }
        char a='a';
        System.out.println(map.get((Object)Character.toUpperCase(a)));
        /*System.out.println(a);
        System.out.println((char)(a-32));*/
    }
}
