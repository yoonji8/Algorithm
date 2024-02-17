import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String number : phone_book) {
            map.put(number, 1);
        }
        
        for(String number : phone_book) {
            for(int j=1; j<number.length(); j++) {
                String s = number.substring(0, j);
                if(map.containsKey(s)){
                    return false;
                }
            }
        }
        
        return answer;
    }
}