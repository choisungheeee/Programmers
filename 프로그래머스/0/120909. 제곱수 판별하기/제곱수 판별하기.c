#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 2;
    
    for(int i=1; i<n; i++) {
        int n1 = n;
        
        if(n1 % i == 0) {
            n1 /= i;
        }
        if(i == n1) {
            answer = 1; 
            break;
        }
    }
    
    return answer;
}