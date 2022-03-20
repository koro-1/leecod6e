public class TruncateSentence {
   static public String truncateSentence(String s, int k) {
                                      // how are you ?
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==' '&&--k==0)
                return  s.substring(0,i);

        }



        return s;
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence("how are you friden?",3));
    }
}
