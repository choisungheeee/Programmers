class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
            if(Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            }
            else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        
        return answer;
    }
}

/*
Character.isUpperCase() 메소드 : 대문자 여부 확인
Character.isLowerCase() 메소드 : 소문자 여부 확인
Character.toUpperCase() 메소드 : 대문자로 변환
Character.toLowerCase() 메소드 : 소문자로 변환
*/