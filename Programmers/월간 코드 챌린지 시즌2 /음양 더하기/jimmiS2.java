class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int x = 0;
        for(int i=0; i<signs.length; i++){
            if(signs[i]) x=1;
            else x=-1;
            answer += absolutes[i] * x;
        }
        return answer;
    }
}
