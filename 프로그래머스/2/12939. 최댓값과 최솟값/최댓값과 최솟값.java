import java.util.*;
class Solution {
    public String solution(String s) {
        String[] s_arr = s.split(" ");
        int[] arr = new int[s_arr.length];

        
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(s_arr[i]);
        }
        
        Arrays.sort(arr);
        
        return arr[0] + " " + arr[arr.length-1];
    }
}