package arraysOne;

public class MoveAllZerosToLeft {
    public static void main(String[] args) {
        int[] arr = {12,0, 1, 0, 3, 12};
        moveAllZerosToLeft(arr);
    }
    static void moveAllZerosToLeft(int[] arr){
        int i=0;

         for(int x: arr){
             if(x!=0) arr[i++]=x;
         }
         while(i<arr.length) arr[i++]=0;

         for(int x :arr) System.out.print(x + " ");
    }
}
