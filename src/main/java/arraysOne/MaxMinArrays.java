package arraysOne;
import java.util.*;

public class MaxMinArrays {
    public static void main(String[] args) {
        int arr[]={31,65,1,2,-5,312};
        System.out.println(maxmin(arr));

    }
    static ArrayList<Integer> maxmin(int[] arr){
        ArrayList<Integer> mp=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int x : arr){
            if(x<min){
                min=x;
            }
            else if(x>max){
                max=x;
            }

        }
            mp.add(max);
        mp.add(min);
        return mp;
    }
}
