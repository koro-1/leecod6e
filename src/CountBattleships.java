import java.util.Arrays;

public class CountBattleships {

    char [][]copy;

    public int countBattleships(char[][] board) {
        int sum=0;
            copy=board.clone();
            int fangxiang=0;
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[0].length ; j++) {
                if (copy[i][j]=='x'){
                    sum++;
                    if (j+1<board[0].length&&copy[i][j+1]=='x') fangxiang=1;
                    else if (i+1<board.length&&copy[i+1][j]=='x')fangxiang=2;

                    display(i,j,fangxiang);
                }

            }
        }
        return sum;
    }
    void display(int i,int j,int fangxiang){
        copy[i][j]='.';
        if (fangxiang==1){

            for (int k = j; k <copy[0].length ; k++) {
                  copy[i][k]='.';
                if (k+1>=copy[0].length||copy[i][k+1]!='x') break;

            }



        }
        if (fangxiang==2){
            for (int k = i; k <copy.length ; k++) {

                copy[k][j]='.';
                if (k+1>=copy.length||copy[k+1][j]!='x') break;
            }

        }

    }

    public static void main(String[] args) {
        char border[][]={{'x','.','.','x'},{'.','.','.','x'},{'.','.','.','x'}};
        System.out.println(border.length);
        System.out.println(border[0].length);
        System.out.println(new CountBattleships().countBattleships(border));
        for (char[] chars : border) {
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
