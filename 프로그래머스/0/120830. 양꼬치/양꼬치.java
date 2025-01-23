class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int service = 0;    // 서비스 음료수 갯수
        
        if(n >= 10) service = n / 10;
        answer = (n * 12000) + (k * 2000) - (service * 2000);   
        
        return answer;
    }
}