class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n <= 7) answer = 1;
        else {
            while(n > 0) {
                n -= 7;
                answer += 1;
            }
        }
        
        return answer;
    }
}