package binarySearch;

public class BinarySearchDemoDesOrd {
    public static void main(String[] args) {
        int[] arr={48, 36, 20, 14, 12, 11, 9, 6, 4, 2};
        int target=11;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(target<arr[mid]){
               start=mid+1;
            }
            else if(target>arr[mid]){
                end=mid-1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
