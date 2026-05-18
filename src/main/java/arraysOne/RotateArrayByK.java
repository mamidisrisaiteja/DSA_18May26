package arraysOne;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rotateArray(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArray(int[] a,int k){
        ReverseArrayRange.reverseArrayRange(a,0,a.length-1);
        ReverseArrayRange.reverseArrayRange(a,0,k-1);
        ReverseArrayRange.reverseArrayRange(a,k,a.length-1);
    }
}
