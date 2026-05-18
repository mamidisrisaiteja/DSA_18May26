package binarySearch;

public class BinarySearchOrderAgnosticApproach {
    public static void main(String[] args) {
       int[] arr={90,75,18,12,6,4,3,1};
        int target=6;
       //int[] arr={2,4,6,9,11,12,14,20,36,48};
       //int target=20;

        if(arr[0]<arr[arr.length-1]){
            System.out.println(binarySearchAsc(arr,target));
        }
        else{
            System.out.println(binarySearchDes(arr,target));
        }

    }
    static int binarySearchAsc(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    static int binarySearchDes(int[] arr,int target){
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
