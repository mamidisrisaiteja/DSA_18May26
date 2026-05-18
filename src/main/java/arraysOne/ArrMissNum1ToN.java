package arraysOne;

import java.util.Arrays;

public class ArrMissNum1ToN {
    public static void main(String[] args) {
        int arr[]={1,3,2,4,6,7};
        Arrays.sort(arr);

        System.out.println(missNum1ToN(arr));
    }
    public static int missNum1ToN(int[] a){
        int sum=0;
        int n=a[a.length-1];
        int sumOrg=(n*(n+1))/2;
        int i=0;
        while(i<a.length){
            sum+=a[i];
            i++;
        }

        return sumOrg-sum;

    }
}
