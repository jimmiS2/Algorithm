import java.util.*;

public class Solution {
    public int solution(int n) {
        int temp = 0;
        
       for(int i=0; i<100; i++){
           temp += n % 10;
           n = n / 10;
           if(n < 10){
               temp += n;
               break;
           }
       }
        
        return temp;
    }
}
