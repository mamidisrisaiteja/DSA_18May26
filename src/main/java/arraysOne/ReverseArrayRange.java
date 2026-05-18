package arraysOne;

import java.util.Arrays;

public class ReverseArrayRange {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,6,8,7};
        reverseArrayRange(arr,1,4);
        System.out.println(Arrays.toString(arr));

    }
    static void reverseArrayRange(int[] a,int index1,int index2){
        while(index1<index2){
            int temp=a[index1];
            a[index1]=a[index2];
            a[index2]=temp;
            index1++;
            index2--;
        }
    }
}
