public class ChangeWine {
    static public int numWaterBottles(int numBottles, int numExchange) {
              int sum=numBottles;
              int empty=numBottles;



              while(empty>=numExchange){

                  sum+=empty/numExchange;
                  empty=empty/numExchange+empty%numExchange;

              }
return sum;


    }


    public static void main(String[] args) {
        System.out.println(numWaterBottles(2,3));

    }
}
