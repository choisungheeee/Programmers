class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] answer = my_string.split("");
        
        String tmp = answer[num1];
        answer[num1] = answer[num2];
        answer[num2] = tmp;     
        
        return String.join("", answer);
    }
}

/*

String.join(separator, strings) 메서드 
    : 구분자를 사용하여 문자열 배열의 각 요소를 결합하여 하나의 문자열로 만든다.
    
*/