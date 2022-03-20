//
//
//import java.util.*;
//
//public  class CheckInclusion {
//
//
//
//    List<Map.Entry<Character, Integer>> jiexi(String s){
//
//        Map<Character,Integer>map=new HashMap<>();
//
//        for (int i = 0; i <s.length() ; i++) {
//            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//
//
//        }
//       java.util.List<Map.Entry<Character, Integer>> list = new LinkedList<>(map.entrySet());
//
//
//       // 下面的也可以写成lambda表达式这种形式
//       // Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
//       Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
//           @Override
//           public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
//               return o2.getValue().compareTo(o1.getValue()); // 这里改为根据value值进降序排序，这里也可以改成根据key和value进行排序
//           }
//       });
//        return list;
//
//
//
//    }
//    boolean equsl(List<Map.Entry<Character, Integer>>list1,List<Map.Entry<Character, Integer>>list2){
//
//       for (int i = 0; i <list1.size() ; i++) {
//
//           if (list1.get(i).getKey()!=list2.get(i).getKey()|| !list1.get(i).getValue().equals(list2.get(i).getValue()))
//               return false;
//
//       }
//       return true;
//
//   }
//
//   static public boolean checkInclusion(String s1, String s2) {
//          List<Map.Entry<Character, Integer>> list1=jiexi(s1);
//          List<Map.Entry<Character, Integer>> list2;
//          int len1=s1.length(),len2=s2.length();
//
//        for (int i = 0; i <=len2-len1 ; i++) {
//
//            list2=jiexi(s2.substring(i,i+len1));
//           if (equsl(list1,list2))
//               return true;
//        }
//          return false;
//
//
//
//
//
//    }
//
//     public static void main(String[] args) {
//         System.out.println( jiexi("asda"));
//         System.out.println(checkInclusion("asda","asddwwe"));
//
//
//
//
//
//     }
//}
