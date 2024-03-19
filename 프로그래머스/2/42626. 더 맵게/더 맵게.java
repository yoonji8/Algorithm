import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int s : scoville) {
            pq.add(s);
        }
        
        while(pq.peek() < K) {
            if(pq.size() >= 2) {
                int first = pq.poll();
                int second = pq.poll() * 2;
                pq.add(first + second);
                answer++;
            } else {
                return -1;
            }
            
        }
        return answer;
    }
}