    package binarySearch;

    public class BinarySearchDemoAscOrd2 {
        public static void main(String[] args) {
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        int start=0;
        int end=arr.length-1;

            System.out.println(binarySearch(arr,36,start,end));
        }
        static int binarySearch(int[] arr,int target,int start,int end){
            if(start>end) return -1;
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                return binarySearch(arr,target,mid+1,end);
            }
            else{
                return binarySearch(arr,target,start,mid-1);
            }

        }
    }
