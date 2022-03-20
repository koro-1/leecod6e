public class NumberOfMatches {
    int sum=0;
    public int numberOfMatches(int n) {

        digui(n);   //7
        return sum;
    }
    void digui(int n){
        if (n<2) return;
        sum = sum + n / 2;
        if (!(n%2==0)) {

            digui(n / 2 + 1);
        }
        else {

            digui(n/2);
        }



    }

    public static void main(String[] args) {
        System.out.println(        new NumberOfMatches().numberOfMatches(0)
        );    }
}
