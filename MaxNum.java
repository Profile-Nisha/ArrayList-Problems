import java.util.*;
public class MaxNum {
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(1);
        list.add(11);
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        
        }
        System.out.println(max);
    }
    
}
