import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++) {
            String a1 = Integer.toBinaryString(arr1[i]);
            String a2 = Integer.toBinaryString(arr2[i]);
            
            a1 = String.format("%" + n + "s", a1).replace(' ', '0');
            a2 = String.format("%" + n + "s", a2).replace(' ', '0');
            
            String str = "";
            
            for(int j=0; j<n; j++){
                if(a1.charAt(j) == '1' || a2.charAt(j) == '1'){
                    str += "#";
                }else{
                    str += " ";
                }
            }
            answer[i] = str;
        }
        return answer;
    }
}