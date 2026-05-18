package arraysOne;

import java.util.Arrays;

public class Swap2EleArray {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,6,8,7};
        swap2EleArray(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap2EleArray(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
