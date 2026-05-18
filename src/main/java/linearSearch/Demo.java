package linearSearch;

public class Demo {
    public static void main(String[] args) {
        int arr[]={31,65,1,2,-5,312};
        System.out.println(linearSearch(arr,21));
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index< arr.length;index++){
            if(target==arr[index]) return index;

        }
        return -1;

    }
}
