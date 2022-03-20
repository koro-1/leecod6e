import java.util.HashMap;
import java.util.Map;

public class CountAndSay {
  private String b="";
   String count(String n){

        String newn=n; //1 2 1 1
        Map<String,Integer>map= new HashMap<>();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i <newn.length() ; i++) {
            String temp=String.valueOf(newn.charAt(i));
            int value=0;
            if (map.getOrDefault(temp,0)==0)
                value=1;
            else value=map.getOrDefault(temp,0)+1;
            map.put(temp,value);

            if (i==newn.length()-1||newn.charAt(i)!=newn.charAt(i+1)){
                stringBuilder.append(map.get(temp)).append(temp);
                map.put(temp,0);
            }
        }


        return stringBuilder.toString();
    }
      String say(int n, String s){

       if (n==0) return s;

       b= say(n-1,count(s));

       return b;
     }

     public String countAndSay(int n) {





        return say(n-1,String.valueOf(1));
    }

    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(10));
    }
}
