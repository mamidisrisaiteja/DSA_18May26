package arraysOne;
import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
      //input
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }

        //output
//        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]);
//            }
//        System.out.println();
//        }
        //output using Arrays.toString()
//        for(int row=0;row<arr.length;row++){
//
//                System.out.println(Arrays.toString(arr[row]));
//


        //output using enhanced for loop
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
