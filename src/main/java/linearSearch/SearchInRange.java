package linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[]={31,65,1,2,-5,312};
        System.out.println(linearSearch(arr,2,1,4));
    }
    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int index=start;index< end;index++){
            if(target==arr[index]) return index;

        }
        return -1;

    }
}
