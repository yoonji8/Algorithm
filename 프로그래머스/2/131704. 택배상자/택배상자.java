import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack();
        int idx = 0;
        
        for(int i=0; i<order.length; i++) {
            if(order[order[idx]-1] != order[i]) {
                stack.push(order[i]);
            } else {
                answer++;
                idx++;
            }
            while(!stack.isEmpty() && order[order[idx]-1] == stack.peek()) {
                stack.pop();
                answer++;
                idx++;
            }
        }
        
        return answer;
    }
}