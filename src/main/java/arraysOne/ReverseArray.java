package arraysOne;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,6,8,7};
        reverseArray(arr);
        System.out.println(Arrays.toString((arr)));

    }
    static void reverseArray(int[] arr){
        int length=arr.length;
        int i=0,j=length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
