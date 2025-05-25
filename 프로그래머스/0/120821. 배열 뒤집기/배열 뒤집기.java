class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;   // 배열의 길이
        int reverse = length-1;         // 거꾸로 뒤집을 배열의 길이
        
        int[] answer = new int[length];
        
        for(int i=0; i<length; i++) {
            answer[reverse--] = num_list[i];
        }        
        
        return answer;
    }
}
