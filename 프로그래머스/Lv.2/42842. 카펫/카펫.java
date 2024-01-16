class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for(int i=3; i<sum; i++) {
            int j = sum/i;
            if((i-2)*(j-2)==yellow) {
                answer[0] = j;
                answer[1] = i;
                break;
            }
            
        }
        
        return answer;
    }
}