class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int i = 0;
        while(i<numbers.length)
            answer += numbers[i++];
        answer = answer / numbers.length;
        return answer;
    }
}