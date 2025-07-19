package Day_25;
import java.util.*;
public class revArLi{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
//added
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //list intial index started from list.size()-1 it gives 5-2 4 is the starting index and 
        // till 0 and each time decrement happen by 1
        for(int i=list.size()-1;i>=0;i--){
            //list.get(i) will fetch the value from the given array list at i index every time
            System.out.print(list.get(i));
        }
        int max=list.get(0);
        // for max value
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println("The Maximum number is"+ max);
    }

 
}