package binarySearch;

public class PeakIndexInMountArr {
    public static void main(String[] args) {
        int[] arr={0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return -1;

    }
}
