package Day_25;
import java.util.*;
public class SWAP {
    public static void Swapping2number(ArrayList<Integer> list, int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
            int idx1=0;
            int idx2=2;
        Swapping2number(list,idx1,idx2);
        System.out.print(list);


    }
}
