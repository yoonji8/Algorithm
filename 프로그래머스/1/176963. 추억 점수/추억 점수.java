import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        int[] answer = new int[photo.length];
        for(int i=0;i<name.length;i++){
            map.put(name[i],yearning[i]);
        }
        for(int i=0;i<photo.length;i++){
            String[] photos = photo[i];
            int score=0;
            for(int j=0;j<photos.length;j++){
                if(map.containsKey(photos[j])){
                    score += map.get(photos[j]);
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}