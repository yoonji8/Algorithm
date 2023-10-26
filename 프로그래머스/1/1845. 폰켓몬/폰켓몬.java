import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        if(answer > map.size()){
            answer = map.size();
        }
        return answer;
    }
}