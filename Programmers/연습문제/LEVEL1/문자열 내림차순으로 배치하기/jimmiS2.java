import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        for(int i=0; i<str.length; i++){
            sb.append(str[i]);
        }
        answer = sb.toString();
        return answer;
    }
}
