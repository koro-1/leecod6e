public class IsOneBitCharacter {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits[bits.length-1]==1) return false;
        int num=0;
        for (int i = bits.length-2; i >=0 ; i--) {

             if (bits[i]==1) num++;
             else break;

        }
        return num % 2 == 0;


    }

    public static void main(String[] args) {
        System.out.println(new IsOneBitCharacter().isOneBitCharacter(new int[]{1, 1, 0, 0, 1, 1, 1, 0}));
    }
}
