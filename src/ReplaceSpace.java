import java.util.Arrays;

public class ReplaceSpace {

    public String replaceSpace(String s) {

         String sss="";
         if (s.length()==0)return "";
         String [] ss=s.split(" ");
         if (ss.length==0){
             for (int i = 0; i <s.length() ; i++) {
                   sss=sss+"%30";
             }

         }else {

             System.out.println(Arrays.toString(ss));
             StringBuilder stringBuilder = new StringBuilder();
             for (int i = 0; i < ss.length; i++) {

                 stringBuilder.append(ss[i]);
                 if (i == ss.length - 1&&s.charAt(s.length()-1)==' ')stringBuilder.append("%20");
                 if (i != ss.length - 1) {

                     stringBuilder.append("%20");
                 }
             }
             sss = stringBuilder.toString();
         }
       return sss;
    }

    public static void main(String[] args) {
        System.out.println(new ReplaceSpace().replaceSpace("ab  ede   "));
    }
}
