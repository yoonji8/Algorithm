class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        
        for(int i=0; i<section.length; i++){
            if(section[i] >= start){
                answer++;
                start = section[i] + m;
            }
        }
        return answer;
    }
}