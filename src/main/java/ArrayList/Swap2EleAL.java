package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Swap2EleAL {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(al);
        swap(al,2,4);
        System.out.println(al);

    }
    public static void swap(List<Integer> al, int index1, int index2){
        int temp=al.get(index1);
        al.set(index1,al.get(index2));
        al.set(index2,temp);
    }
}
