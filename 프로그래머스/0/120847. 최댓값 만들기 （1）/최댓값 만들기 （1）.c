#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numbers_len은 배열 numbers의 길이입니다.
int solution(int numbers[], size_t numbers_len) {
    int answer = 0;
    int m1 = -1, m2 = -1;
    
    for(int i=0; i<numbers_len; i++) {
        if(m1 < numbers[i]) m1 = numbers[i];    
    }
    for(int i=0; i<numbers_len; i++) {
        if((m2 < numbers[i]) && (m1 != numbers[i])) m2 = numbers[i];
    }    
    if(m2 == -1) m2 = m1;
    
    answer = m1 * m2;
    
    return answer;
}