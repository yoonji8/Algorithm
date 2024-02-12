import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] arr = new int[progresses.length];
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<progresses.length; i++) {
            arr[i] = (int)Math.ceil((double)(100-progresses[i]) / speeds[i]);
        }
        
        int front = arr[0];
        int num = 1;
        for(int i=1; i<arr.length; i++) {
            if(front >= arr[i]) {
                num++;
            }else {
                list.add(num);
                num = 1;
                front = arr[i];
            }
        }
        list.add(num);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}