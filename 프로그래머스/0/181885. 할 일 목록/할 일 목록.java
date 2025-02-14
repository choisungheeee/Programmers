class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int no = 0;
        for(int i=0; i<finished.length; i++) {
            if(!finished[i]) no += 1;
        }        
        
        String[] answer = new String[no];
        int h = 0;
        for(int i=0; i<todo_list.length; i++) {
            if(!finished[i]) {
                answer[h++] = todo_list[i];
            }
        }
        
        return answer;
    }
}