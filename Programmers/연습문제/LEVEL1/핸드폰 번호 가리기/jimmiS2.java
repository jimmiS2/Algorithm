import java.util.*;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int x = phone_number.length();
        String[] arr = phone_number.split("");
        StringBuffer sb = new StringBuffer();  
        for(int i=0; i<x; i++){
            if(i >= x-4){
                sb.append(arr[i]);
            }else{
            sb.append("*");
            }
        }
        answer = sb.toString();
        return answer;
    }
}
