
import java.util.*;
public class Swap {
    public static void swptwo(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(1);
        list.add(11);
        int idx1 = 2;
        int idx2 = 4;
        swptwo(list, idx1, idx2);
        System.out.println(list);
        
    }
    
}


