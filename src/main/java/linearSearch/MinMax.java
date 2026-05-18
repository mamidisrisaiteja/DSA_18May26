package linearSearch;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int arr[]={31,65,1,2,-5,312};
        System.out.println(Arrays.toString(minMax(arr)));
    }
    static int[] minMax(int[] arr){
//        int arr1[]=new int[2];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int x: arr){
            if(x<min){
                min=x;
            }
            if(x>max){
                max=x;
            }
        }
        return new int[]{min,max};
    }
}
