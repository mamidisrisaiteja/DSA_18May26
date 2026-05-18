package linearSearch;

import java.util.Arrays;

public class MaxMin2DArr {
    public static void main(String[] args) {
        int arr[][]={
                {34,67,9,14,3},
                {23,4,5},
                {1,41,15,6}
        };

        System.out.println(Arrays.toString(maxMinIn2DArr(arr)));
    }
    static int[] maxMinIn2DArr(int[][] arr){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int[] arr1=new int[2];
        for(int row=0;row<arr.length;row++){

            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]<min){
                    min=arr[row][col];
                }
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
                arr1[0]=min;
                arr1[1]=max;
            }
        }
        return arr1;
    }
}
