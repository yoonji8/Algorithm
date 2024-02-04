import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.values());

        Collections.sort(list, Collections.reverseOrder());
        
        for(int l : list){
            if(k>0) {
                k -= l;
                answer++;
            }else {
                break;
            }
        }
        
        return answer;
    }
}