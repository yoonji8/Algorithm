import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> wMap = new HashMap<>();
        
        for(int i=0; i<want.length; i++) {
            wMap.put(want[i], number[i]);
        }
        
        for(int i=0; i<discount.length - 9; i++) {
            Map<String, Integer> dMap = new HashMap<>();
            
            for(int j=0; j<10; j++) {
                dMap.put(discount[i+j], dMap.getOrDefault(discount[i+j],0) + 1);
            }
            
            Boolean isIdentical = true;
            
            for(String key : wMap.keySet()){
                if(wMap.get(key) != dMap.get(key)) {
                    isIdentical = false;
                    break;
                }
            }
            
            if(isIdentical) {
                answer++;
            }
        }
        
        return answer;
    }
}