package binarySearch;

public class Floor {
    public static void main(String[] args) {

        int[] arr={2,4,6,9,11,12,14,20,36,48};
        System.out.println(floor(arr,15));
    }
    static int floor(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }

        }
        return end;
    }
}
