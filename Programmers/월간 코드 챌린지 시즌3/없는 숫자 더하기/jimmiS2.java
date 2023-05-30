class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        int cnt = 0;
        for(int i=0; i<numbers.length; i++){
            cnt += numbers[i];
        }
        return answer-cnt;
    }
}
