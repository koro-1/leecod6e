public class Demo10_1 {
    public static void main(String args[]){
        int array[][] = {{2, 3, 4}, {5, 6, 7}};
        int destArray[][]= new int[3][2];
        System.out.println("源数组输出：");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                destArray[j][i] = array[i][j];
            }
        }
        System.out.println("目标数组输出：");
        for(int i = 0; i < destArray.length; i++){
            for(int j = 0; j < destArray[i].length; j++){
                System.out.print(destArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}