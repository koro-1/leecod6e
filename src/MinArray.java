public class MinArray {


    public int minArray(int[] numbers) {
     boolean flag=true;
      int num=0;

        if (numbers.length%2==0)flag=false;

        for (int i = 1; i <numbers.length ; i++) {

              if (numbers[i-1]>numbers[i]) {num=i;break;}


        }
        System.out.println(num);
        if (!flag)
         return numbers[num];
        else return numbers[num];




    }

    public static void main(String[] args) {
        int num[]={4,5,6,1,2};
        System.out.println(        new MinArray().minArray(num)
        );    }
}
