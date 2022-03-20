import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class MapSum {
       private Map<String,Integer> hashMap;
    public MapSum() {
      

       hashMap=new HashMap<>();

    }

    public void insert(String key, int val) {
        hashMap.put(key,val);
    }

    public int sum(String prefix) {
        Set set = hashMap.entrySet();
     int sum=0;
        for(Iterator iter = set.iterator(); iter.hasNext();)
        {
            Map.Entry entry = (Map.Entry)iter.next();

            String key = (String)entry.getKey();
            Integer value = (Integer) entry.getValue();
            if (key.indexOf(prefix)==0)sum=sum+value;

            System.out.println(key +" :" + value);
        }

        return sum;
    }

    public static void main(String[] args) {
       MapSum mapSum= new MapSum();
       mapSum.insert("app",5);
       mapSum.insert("a",1);
       mapSum.insert("a2p",1);
        System.out.println(mapSum.sum("ap"));
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */