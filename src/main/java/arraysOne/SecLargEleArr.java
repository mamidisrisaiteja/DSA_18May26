package arraysOne;

import java.util.Arrays;

public class SecLargEleArr {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,6,8,7};
        System.out.println(secLarEleArr(arr));
       // System.out.println(Arrays.toString(arr));
    }
    public static int secLarEleArr(int[] arr){
        int largest=Integer.MIN_VALUE;
        int secLargest=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]>largest){
                secLargest=largest;
                largest=arr[i];


            }else if(arr[i]> secLargest && arr[i]!=largest){
                secLargest=arr[i];
            }
            i++;

        }
        return secLargest;
    }
}
