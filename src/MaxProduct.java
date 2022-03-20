//import java.util.*;
//
//public class MaxProduct {
//
//
//        public int maxProduct(String[] words) {
//           Map<String,Integer>map=new HashMap<>();
//            for (int i = 0; i <words.length ; i++) {
//
//                 map.put(words[i],words[i].length());
//
//            }
//            List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
//
//
//            // 下面的也可以写成lambda表达式这种形式
//            // Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
//            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//                @Override
//                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                    return o2.getValue().compareTo(o1.getValue()); // 这里改为根据value值进降序排序，这里也可以改成根据key和value进行排序
//                }
//            });
//            System.out.println(Arrays.toString(list.toArray()));
//
//
//
//
//
//return 0;
//    }
//    static   Boolean pd(String s1,String s2){
//            int l1=s1.length();
//            int l2=s2.length();
//            if (l1>=l2) {
//
//                for (int i = 0; i <l2 ; i++) {
//                  if ((s1.indexOf(s2.charAt(i)))!=-1) return true;
//                }
//
//            }else {
//
//                for (int i = 0; i <l1 ; i++) {
//                    if ((s2.indexOf(s1.charAt(i)))!=-1) return true;
//                }
//
//            }
//
//         return    false;
//      }
//
//    public static void main(String[] args) {
//        String []words={"a","ab","abc","d","cd","bcd","abcd"};
//        Map<String,Integer>map=new HashMap<>();
//        for (int i = 0; i <words.length ; i++) {
//
//            map.put(words[i],words[i].length());
//
//        }
//        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
//
//
//        // 下面的也可以写成lambda表达式这种形式
//        // Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o2.getValue().compareTo(o1.getValue()); // 这里改为根据value值进降序排序，这里也可以改成根据key和value进行排序
//            }
//        });
//        System.out.println(Arrays.toString(list.toArray()));
//        System.out.println(list.get(0).getKey());
//         int max=0;
//        for (int i = 0; i <list.size() ; i++) {
//            for (int j = i+1; j <list.size() ; j++) {
//                if (!pd(list.get(i).getKey(),list.get(j).getKey())) max=Math.max(max,list.get(i).getValue()*list.get(j).getValue());
//
//            }
//        }
//        System.out.println(pd("bar","baz"));
// System.out.println("werw".indexOf("sss".charAt(0)));
//
//
//
//
//    }
//}
