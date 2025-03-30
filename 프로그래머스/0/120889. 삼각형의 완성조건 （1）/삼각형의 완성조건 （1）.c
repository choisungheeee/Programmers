#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// sides_len은 배열 sides의 길이입니다.
int solution(int sides[], size_t sides_len) {
    int answer = 0;
    int max = -1, max_index = -1;
    
    // 가장 큰 변 구하기
    for(int i=0; i<sides_len; i++) {
        if(max < sides[i]) {
            max = sides[i];
            max_index = i;
        }
    }
    
    // 나머지 두 변의 합 구하기
    for(int i=0; i<sides_len; i++) {
        if(i != max_index) answer += sides[i];
    }
    
    // 가장 큰 변과 나머지 두 변의 합 비교
    if(answer > max) answer = 1;
    else answer = 2;
    
    return answer;
}