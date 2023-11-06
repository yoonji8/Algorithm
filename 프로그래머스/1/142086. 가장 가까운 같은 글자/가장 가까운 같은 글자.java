import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Arrays.fill(answer, -1);
        char[] charArr = s.toCharArray();
        for(int i=s.length()-1; i>=0; i--){
            for(int j=i-1; j>=0; j--){
                if(charArr[i] == charArr[j] && i != 0){
                    answer[i] = i - j;
                    break;
                }
            }
        }
        
        return answer;
    }
}