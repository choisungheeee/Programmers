#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int answer = 0;
    int s = 0; // 음료수 서비스
    
    if(n >= 10) s = n / 10;
    
    answer = n * 12000 + k * 2000 - s * 2000;    
    
    return answer;
}