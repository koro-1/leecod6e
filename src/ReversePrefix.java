public class ReversePrefix {

 static   public String reversePrefix(String word, char ch) {

    return   new StringBuilder(word.substring(0,word.indexOf(ch)+1)).reverse().append(word.substring(word.indexOf(ch)+1,word.length())).toString();



   }

    private  String resever(String word,int index) {
         String copy=word.substring(0,index+1);
         char []chars=copy.toCharArray();
         int l=0,f=chars.length-1;
         while (l<=f){
             char temp=chars[f];
             chars[f] =chars[l];
             chars[l] =temp;
             l++;f--;
         }
        return word.replace(copy, new String(chars));

    }

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }
}
