#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* my_string, const char* is_prefix) {
    int answer = 0;
    int my_len = strlen(my_string);
    int pre_len = strlen(is_prefix);
    
    if(my_len >= pre_len) {
        int k = 0;
        for(int i=0; i<pre_len; i++) {
            if(my_string[i] == is_prefix[i]) k += 1;
        }
        if(pre_len == k) answer = 1;
    }
    
    return answer;
}