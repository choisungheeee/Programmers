#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* my_string) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    char* answer = (char*)malloc(sizeof(char)*(strlen(my_string) + 1));
    
    int k = 0;
    for(int i=strlen(my_string)-1; i>=0; i--) {
        answer[k++] = my_string[i];
    }
    answer[strlen(my_string)] = '\0';
    
    return answer;
}

// c언어에 문자열 끝은 \0이 있어야 하므로 answer 길이를 +1 해줘야 함
// 그리고 문자열 끝에 \0을 넣지 않으면 printf("%s", answer); 시 이상 값 출력될 수 있으니 \0 추가해줘야 함