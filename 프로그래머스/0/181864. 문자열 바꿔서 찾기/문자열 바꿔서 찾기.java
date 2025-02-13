class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        myString = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');
        
        if(myString.contains(pat)) answer = 1;
        
        return answer;
    }
}

/*
replace() 메서드 : 문자 변환
contains() 메서드 : 문자열에 특정 문자를 포함하고 있는지 확인, 대소문자 구분
*/