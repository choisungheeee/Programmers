class Solution {
    public int[] solution(int n) {
        
        // 약수 갯수 구하기
        int check = 0;  
        for(int i=1; i<=n; i++) {
            if(n%i == 0) check += 1; 
        }
        
        // 약수 갯수 인덱스 입력
        int[] answer = new int[check];
        
        // n의 약수 오름차순으로 담기
        int j = 0;
        for(int i=1; i<=n; i++) {
            if(n%i == 0) answer[j++] = i;  
        }
        
        return answer;
    }
}