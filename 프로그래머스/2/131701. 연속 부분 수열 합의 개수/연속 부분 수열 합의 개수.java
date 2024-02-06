import java.util.*;
class Solution {
    public int solution(int[] elements) {
        
        Set<Integer> set = new HashSet<>();
        
        int count = elements.length;
        
        while(count > 0) {
            for(int i=0; i<elements.length; i++) {
                int sum = 0;
                for(int j=i; j<i+count; j++) {
                    sum += elements[j % elements.length];
                }
                set.add(sum);
                
            }
            count--;
        }
        
        return set.size();
    }
}