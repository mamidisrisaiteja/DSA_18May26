package binarySearch;

public class NextGreatestLetter {
    public static void main(String[] args) {
//        char[] letters = {'x','x','y','y'};
      //  char target='z';
        char[] letters = {'c','f','j'};
        //char target='f';
        char target='c';

        System.out.println(nextGreatestLetter(letters,target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start=0;
        int end=letters.length-1;
        while(start>=end){
            int mid=start+(end-start)/2;
//            if(letters[mid]<target){
//                start=mid+1;
//            }else{
//                end=mid-1;
//            }
            if(letters[mid]>target){
                end=mid-1;
            }
            else if(letters[mid]<target){
                start=mid+1;
            }
        }
 return letters[start];
    }

}
