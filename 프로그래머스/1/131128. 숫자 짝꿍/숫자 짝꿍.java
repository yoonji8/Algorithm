import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        
        for(String s : X.split("")) {
            arr1[Integer.parseInt(s)]++;
        }
        
        for(String s : Y.split("")) {
            arr2[Integer.parseInt(s)]++;
        }
        
        for(int i=9; i>=0; i--) {
            if(arr1[i]>0 && arr2[i]>0) {
                int count = Math.min(arr1[i], arr2[i]);
                for(int j=0; j<count; j++) {
                    sb.append(i);
                }
            }
        }
        
        if(sb.length()==0) return "-1";
        if(sb.charAt(0)=='0') return "0";
        
        return sb.toString();
    }
}