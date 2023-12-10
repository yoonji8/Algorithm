import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int num = 0;
        int player = stages.length;
        
        Map<Integer, Double> map = new HashMap<>();
        for (int i=1; i<=N; i++){
            for(int j : stages){
                if(i==j){
                    num++;
                }
            }
            if(player==0){
                map.put(i, 0.0);
            }else{
                map.put(i, (double)num/player);
                player -= num;
                num=0;
            }
        }

        List<Map.Entry<Integer,Double>> list = new ArrayList<Map.Entry<Integer, Double>>(map.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>(){
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2){
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
        int idx = 0;
        for(Map.Entry<Integer, Double> entry : list){
            answer[idx] = entry.getKey();
            idx++;
        }
        return answer;
    }
}