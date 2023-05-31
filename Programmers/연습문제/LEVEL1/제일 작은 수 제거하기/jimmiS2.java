import java.util.*;

class Solution {
    public LinkedList solution(int[] arr) {
        LinkedList<Integer> arrlist = new LinkedList<>();
        int min= 1000;
        
        if(arr.length == 1){
            arrlist.add(-1); 
        }else{
            for(int i: arr){
                if(i< min) min=i; 
            }

            for(int i: arr){
                if(i == min) continue;
                else arrlist.add(i);
            }
        }
        return arrlist;
    }
}
