class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long temp = 0;
    
        for(int i=1; i<=count; i++){
            temp += price * i;
        }

        answer = temp - money;
        if(temp < money){
            return 0;
        }
        return answer;
    }
}
