class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if(price >= 500000) answer = (int)(price * 0.8);
        else if(price >= 300000) answer = (int)(price * 0.9);
        else if(price >= 100000) answer = (int)(price * 0.95);
        else answer = price;
        
        return answer;
    }
}

// >= (이상)의 조건인 경우 가장 큰 수를 첫 번째 조건으로 걸러야 한다.
// <= (이하)의 조건인 경우 가장 작은 수를 첫 번째 조건으로 걸러야 한다. 