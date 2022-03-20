public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {

         int l=0,f=s.length()-1;
         char copy []=s.toCharArray();
         while (l<f){


             if (!Character.isLetter(s.charAt(l))) { l++;continue;}
             if (!Character.isLetter(s.charAt(f))) { f--;continue;}

             char temp =' ';
              temp=copy[l];
              copy[l]=copy[f];
              copy[f]=temp;

             l++;
             f--;
         }
return new String(copy);
    }


    public static void main(String[] args) {
        System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("qwe-rty"));
    }
}
