import java.util.HashMap;
import java.util.Map;

public class DistributeCandies  {

    public int distributeCandies(int[] candyType) {

        Map<Integer,Integer>map=new HashMap<>();

        for (int i = 0; i <candyType.length ; i++) {
              map.put(candyType[i], map.getOrDefault(candyType[i],0)+1);


        }
        for(Integer key:map.keySet()){
            System.out.println("key:"+key+" "+"Value:"+map.get(key));
        }


     return Math.min(map.size(),candyType.length/2);
    }

    public static void main(String[] args) {
        int nums[]={1,1,2,2,3};
        System.out.println(new DistributeCandies().distributeCandies(nums));
    }

}
