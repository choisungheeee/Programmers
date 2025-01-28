class Solution {
    public int[] solution(int n) {
        int[] answer;
        int index = 0;  // 배열 answer 배열 크기
        int a = 0;      // 배열 answer 인덱스 
        
        // 배열 answer 크기 구하기
        for(int i=1; i<=n; i+=2) {
            index += 1;
        }
        
        // 배열 answer 초기화
        answer = new int[index];
        
        // 홀수가 오름차순으로 담긴 배열 생성
        for(int i=1; i<=n; i+=2) {
            answer[a++] = i;
        }
        
        return answer;
    }
}