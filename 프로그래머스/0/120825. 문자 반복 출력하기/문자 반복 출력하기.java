class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
            for(int j=0; j<n; j++) {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}

/*
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");     // 문자열 한글자씩 분리 후 배열 저장
        
        for(int i=0; i<my_string.length(); i++) {
            answer += str[i].repeat(n);         // n번 반복하여 저장
        }
        
        return answer;
    }
}
*/