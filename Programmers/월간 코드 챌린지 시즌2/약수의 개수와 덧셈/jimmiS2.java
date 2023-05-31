class Solution {
    public int Count(int x){
        int result=0;
        for(int i=1; i<=x; i++){
            if(x%i == 0) result++;
        }
        if(result%2 != 0) x = -x; 
        return x;
    }
    
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            answer += Count(i);
        }
        return answer;
    }
}
