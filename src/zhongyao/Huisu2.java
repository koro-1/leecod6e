package zhongyao;

import java.util.*;

public class Huisu2 {
   /* List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        boolean []vistied=new boolean[candidates.length];

        backtrack(candidates, target, new ArrayDeque<>(), 0,vistied);

        return res;
    }

    private void backtrack(int[] candidates, int target, Deque<Integer>path, int i, boolean[] vistied) {
          if (target==0){
              res.add(new ArrayList<>(path));
           return;
          }

    }*/
   List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);


        backtrack(candidates, target, new ArrayDeque<Integer>(), 0);

        return res;
    }

    private void backtrack(int[] candidates, int remains, Deque<Integer>path, int start){
        if(remains == 0){
            if (!res.contains(new ArrayList<>(path)))
                res.add(new ArrayList<>(path));
            return;              // 11125
        }
        // 0 1 2 3
        for(int i = start; i < candidates.length; i++){

            if(candidates[i] > remains)
                break;


            //[2,2,3,5]

            path.add(candidates[i]);

            backtrack(candidates, remains - candidates[i], path, i+1);
           /* if (vistited[i]) continue;
            vistited[i]=true;
            vistited[i]=false;*/
            path.removeLast();


        }
    }
    static public boolean isNStraightHand(int[] hand, int m) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->a-b);
        for (int i : hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            q.add(i);
        }
        while (!q.isEmpty()) {
            int t = q.poll();
            if (map.get(t) == 0) continue;
            for (int i = 0; i < m; i++) {
                int cnt = map.getOrDefault(t + i, 0);
                if (cnt == 0) return false;
                map.put(t + i, cnt - 1);
            }
        }
        return true;
    }



    public static void main(String[] args) {
//        System.out.println(        new Huisu2().combinationSum2(new int []{10, 1, 2, 7, 6, 1, 5},8)
//        );
        System.out.println(        isNStraightHand(new int[]{1,2,3,2,3,4,3,4,5},3)
        );    }
}
