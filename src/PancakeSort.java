import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PancakeSort {

    List<Integer> list=new ArrayList<>();
    int copy[];
    public  void digui(int[] arr){


        for (int i = 0; i < arr.length; i++) {
            if (Arrays.equals(copy, arr)) return;
            int max=0,index=0;
            for (int j = 0; j <arr.length-i ; j++) {
                if (arr[j]>max){
                    max=arr[j];
                    index=j;
                }

            }
            if (index!=0){
                list.add(index+1);
                convert(arr,index+1);
            }

            list.add(arr.length-i);

            convert(arr,arr.length-i);




        }

    }
    void  convert(int []arr,int k){
        int l=0,f=k-1;
        while (l<=f){
            int temp=arr[f];
            arr[f]=arr[l];
            arr[l]=temp;

            l++;
            f--;
        }


    }
    public List<Integer> pancakeSort(int[] arr) {
        copy=arr.clone();
        Arrays.sort(copy);
        if (Arrays.equals(copy, arr)) return list;
        digui(arr);
      return list;

    }

    public static void main(String[] args) {
        System.out.println(new PancakeSort().pancakeSort(new int[]{1,4,2,3}));
    }
}
