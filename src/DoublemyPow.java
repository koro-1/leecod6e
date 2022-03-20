public class DoublemyPow {
   static public double myPow(double x, int n) {
       double temp=1.0;
       boolean  flag=true;
       if (n<0) { flag=false;
       n=n*-1;}

       while (n>1){
           if (n%2==0){
               n=n/2;
               x=x*x;

           }else {

               n=(n-1)/2;
               temp=temp*x;
               x=x*x;



           }
       }
       double c=temp*x;

       return flag ?temp*x:1.0/(temp*x);
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(2,-2147483648));
        System.out.println(myPow(2.00000,
                -2147483648));
    }
}
