class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = -1;   // 가장 긴 변의 길이
        int index = -1; // 가장 긴 변의 위치
        
        // 가장 긴 변의 길이 구하기
        for(int i=0; i<sides.length; i++) {
            if(max < sides[i]) {
                max = sides[i];
                index = i;
            }            
        }
        
        // 다른 두 변의 길이 합 구하기
        for(int i=0; i<sides.length; i++) {
            if(i != index) answer += sides[i];
        }
        
        // 삼각형 만들기 여부 구하기
        if(answer > max) answer = 1;
        else answer = 2;
        
        return answer;
    }
}