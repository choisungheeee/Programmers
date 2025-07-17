#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num, int k) {
    int answer = 0;
    
    // num의 자릿수 확인
    int n = num, a = 0;
    while(n > 0) {
        if(n / 10 > 0) a += 1;
        n /= 10;
    }
    
    // 배열 arr에 num을 이루는 숫자 넣기
    n = num;
    int len = a + 1;
    int arr[len];
    for(int i=len-1; n>0; i--) {
        arr[i] = n % 10;
        n /= 10;
    }
    
    // num을 이루는 숫자 확인
    int check = 0;
    for(int i=0; i<len; i++) {
        if(arr[i] == k) {
            check = 1;
            answer = i + 1;
            break;
        }
    }
    
    if(!check) answer = -1;
    
    return answer;
}