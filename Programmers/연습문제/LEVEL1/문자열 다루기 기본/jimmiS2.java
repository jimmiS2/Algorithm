class Solution {
    public int CheckLen(String s){
        int len = s.length();
        if(len == 4 || len == 6)
            return 1;
        return 0;
    }
    
    public int CheckInt(String s){
        char[] chr = s.toCharArray();
        for(char i: chr){
            if((int)i > 89){
                return 0;
            } 
        }
        return 1;
    }
    public boolean solution(String s) {
        boolean answer = false;
        if(CheckLen(s) == 1 && CheckInt(s) == 1) answer = true;
        return answer;
    }
}
