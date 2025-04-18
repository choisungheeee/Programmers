class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a1 = 0, a2 = 0;
        
        if(arr1.length > arr2.length) answer = 1;
        else if(arr1.length < arr2.length) answer = -1;
        else {
            for(int i=0; i<arr1.length; i++) a1 += arr1[i];
            for(int i=0; i<arr2.length; i++) a2 += arr2[i];
            
            if(a1 > a2) answer = 1;
            else if(a1 < a2) answer = -1;
            else answer = 0;
        }
        
        return answer;
    }
}