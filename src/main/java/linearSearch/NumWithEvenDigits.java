package linearSearch;

public class NumWithEvenDigits {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,-7896};
        System.out.println(findNumbers(nums));
        System.out.println(findNumbers2(nums));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        if(nums.length==0) return -1;
        for(int x :nums){
            int count2=0;
            // if((x+"").length()%2==0){
            //     count++;
            // }
//            if(x<0){
//                x*=-1;
//
//            }
            while(x>0){

                x=x/10;
                count2++;
            }
            if(count2%2==0) count++;
        }
        return count;
    }
    public static int findNumbers2(int[] nums) {
        int count=0;

        for(int x :nums){
            // int count2=0;
            // if((x+"").length()%2==0){
            //     count++;
            // }
            // while(x>0){

            //     x=x/10;
            //     count2++;
            // }
            //if(count2%2==0) count++;
            if((int)Math.log10(x)%2==1) count++;
        }
        return count;
    }
}
