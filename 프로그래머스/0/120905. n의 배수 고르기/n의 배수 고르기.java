class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer;
        int a = 0;  // 배열 answer의 크기
        
        // 배열 answer의 크기 구하기
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i] % n == 0) a += 1;
        }
        
        // numlist에서 n의 배수 answer에 넣어주기
        int b = 0;
        answer = new int[a];
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i] % n == 0) answer[b++] = numlist[i];
        }
        
        return answer;
    }
}