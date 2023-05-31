class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strarr = s.split("");
        int len = strarr.length;
        StringBuilder sb = new StringBuilder();
        if(len%2 == 0){
            sb.append(strarr[len/2 -1]);
        }
        sb.append(strarr[len/2]);
        answer = sb.toString();
        return answer;
    }
}
