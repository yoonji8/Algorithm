import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        String[] s1 = s.substring(2, s.length()-2).split("\\},\\{");
        int[][] arr = new int[s1.length][];
        
        for(int i=0; i<s1.length; i++) {
            String[] s2 = s1[i].split(",");
            arr[i] = new int[s2.length];
            
            for(int j=0; j<s2.length; j++) {
                arr[i][j] = Integer.parseInt(s2[j]);
            }
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                map.put(arr[i][j], map.getOrDefault(arr[i][j], 0) + 1);
            }
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1,o2) -> map.get(o2).compareTo(map.get(o1)));
        
        int[] answer = new int[list.size()];
        int idx = 0;
        for(Integer i : list) {
            answer[idx++] = i;
        }
        
        return answer;
    }
}