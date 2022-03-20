import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PushDominoes {
  static   public String pushDominoes(String dominoes) {
          // .L.R...LR..L..
          // LL.RR.LLRRLL..
        Map<Character,Integer>map=new HashMap<>();
        char copy[]=dominoes.toCharArray();

        for (int i = 0; i <copy.length ; i++) {
            if (copy[i]=='R') {
                if (!map.containsKey('R'))
                map.put(copy[i], i);
                else {
                    int l=i-1, r=map.get('R')+1;
                    while (r<=l){
                        copy[r]='R';
                        r++;
                    }
                    map.put(copy[i], i);
                }


            }

           if (copy[i]=='L'){
               map.put(dominoes.charAt(i),i);
            if (map.containsKey('L')&&!map.containsKey('R')){
                if (!map.containsKey('l')){
                for (int c=map.get('L')-1;c>=0;c--){
                    copy[c]='L';


                }


              map.remove('L');}
                else {
                    int l=map.get('L')-1, r=map.get('l')+1;
                    while (r<=l){


                        copy[r]='L';

                        r++;
                    }
                    map.remove('L');
                }
            }
               if (map.containsKey('R')&&map.containsKey('L')){
                   int l=map.get('L')-1, r=map.get('R')+1;
                   while (r<=l){
                       if (l==r) break;
                       copy[l]='L';
                       copy[r]='R';
                       l--;
                       r++;
                   }
                   map.put('l',map.get('L'));
                   map.remove('L');
                   map.remove('R');

               }

        }
           if (map.containsKey('R')&&i==copy.length-1){

               int l=i, r=map.get('R')+1;
               while (r<=l){


                   copy[r]='R';

                   r++;
               }

           }
        }

         return new String(copy);
    }

    public static void main(String[] args) {
        System.out.println(pushDominoes("R.L..LR..LR.."));
    }
}
