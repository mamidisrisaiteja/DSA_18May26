package linearSearch;

import java.util.Arrays;

public class SearchIn2DArr {
    public static void main(String[] args) {
        int arr[][]={
                {34,67,9,14,3},
                {23,4,5},
                {1,41,15,6}
        };
        System.out.println(Arrays.toString(searchIn2DArr(arr,6)));
    }
    static int[] searchIn2DArr(int[][] arr,int target){
      if(arr.length==0){
          return new int[]{-1,-1};
      }
      for(int row=0;row<arr.length;row++){

          for(int col=0;col<arr[row].length;col++){
              if(arr[row][col]==target){
              return new int[]{row,col};
              }
          }
      }
        return new int[]{-1,-1};
    }
}
