class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        
        for(int i=my_string.length()-1; i>=0; i--) {
            answer += str[i];
        }     
        
        return answer;
    }
}

/*
String 클래스는 인스턴스 생성할 때 지정된 문자열을 변경할 수 없지만, StringBuffer 클래스는 변경 가능

class Solution {
    public String solution(String my_string) {
        StringBuffer str = new StringBuffer(my_string);
        
        return str.reverse().toString();
    }
}
*/