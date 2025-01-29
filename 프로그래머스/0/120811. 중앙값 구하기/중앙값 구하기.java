class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // 배열 값 오름차순 정렬
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        
        // 중앙값 구하기
        answer = array[(int)Math.ceil(array.length/2)];
        
        return answer;
    }
}