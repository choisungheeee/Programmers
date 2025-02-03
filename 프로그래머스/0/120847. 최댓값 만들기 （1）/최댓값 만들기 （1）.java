class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int check = 0;              // 원소 중복 체크 인덱스
        int max1 = -1, max2 = -1;   // 원소1, 원소2

        // 원소1 구하기
        for(int i=0; i<numbers.length; i++) {
            if(max1 < numbers[i]) {
                max1 = numbers[i];
                check = i;
            }
        }
        
        // 원소2 구하기(원소1과 중복되지 않는지 체크)
        for(int i=0; i<numbers.length; i++) {
            if((max2 < numbers[i]) && (check != i)) {
                max2 = numbers[i];
            }
        }
        
        // 최댓값 구하기
        answer = max1 * max2;
        
        return answer;
    }
}