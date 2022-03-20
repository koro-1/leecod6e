public class Demo13_2 {
    public void output(String arrayName, int temp[]) {
        int i;
        for(i = 0; i < temp.length; i++){
            System.out.println(arrayName + "[" + i +"] = " + temp[i]);
        }
    }
    public static void main(String[] args){
        int source[]={1,2};
        int i;
        String arrayName;
        Demo13_2 a = new Demo13_2();
//使用循环复制数组
        int dest1[] = new int[2];
        for(i = 0; i < source.length; i++){
            dest1[i] = source[i];
        }
        arrayName = "dest1";
        a.output(arrayName, dest1);
//使用clone方法
        int dest2[]=(int[])source.clone();
        arrayName = "dest2";
        a.output(arrayName, dest2);
//使用System类中的静态方法arraycopy
        int dest3[] = new int[2];
        System.arraycopy(source, 0, dest3, 0, 2);
        arrayName = "dest3";
        a.output(arrayName, dest3);
    }
}