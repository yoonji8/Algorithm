import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=0;i<d.length;i++){
            if(d[i]<=budget){
                budget -= d[i];
                answer += 1;
            }else{ //1 2 3 4
                break;
            }
        }
        return answer;
    }
}