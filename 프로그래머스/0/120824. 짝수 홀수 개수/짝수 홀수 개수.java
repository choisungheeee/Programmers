class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];      // 짝수와 홀수의 개수를 담은 배열
        int length = num_list.length;   // num_list 배열의 길이
        int even = 0, odd = 0;          // 짝수, 홀수의 개수를 담을 변수
        
        for(int i=0; i<length; i++) {
            if(num_list[i] % 2 == 0) even += 1;
            else odd += 1;
        }
        
        answer[0] = even; answer[1] = odd;
        
        return answer;
    }
}