import java.util.Arrays;

public class MaxNumberOfBalloons {
    int min(int []a){
        String str ="balloon";
        int min =0;
        while (true){
            for (int i = 0; i < str.length(); i++) {
                a[str.charAt(i)-'a']--;
                if (a[str.charAt(i)-'a']==-1) return min;
            }
            min++;
        }



    }
    public int maxNumberOfBalloons(String text) {
        int  []a=new int[26];
        Arrays.fill(a,0);

        for (int i = 0; i < text.length(); i++) {

            a[text.charAt(i)-'a']++;

        }
        return min(a);
    }

    public static void main(String[] args) {
        System.out.println(new MaxNumberOfBalloons().maxNumberOfBalloons("ballon"));
    }
}
