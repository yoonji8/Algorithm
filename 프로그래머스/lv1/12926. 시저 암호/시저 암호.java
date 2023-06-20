import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String[] answer = s.split("");
        char[] arr = new char[answer.length];
        int idx =0;
        for(int i =0; i<answer.length; i++){
            if(!answer[i].equals(" ")){
                int num = answer[i].charAt(0) + n;
                if(answer[i].charAt(0)>='a' && answer[i].charAt(0) <= 'z'){
                    if(num>'z'){
                        num -= 26;
                    }
                }else if (answer[i].charAt(0) >= 'A' && answer[i].charAt(0) <= 'Z') {
                    if (num > 'Z') {
                        num -= 26;
                    }
                }
                arr[idx] = (char)num;
                idx++;
            }else if(answer[i].equals(" ")){
                arr[idx] = ' ';
                idx++;
            }
        }
        String ss = new String(arr);
        return ss;
    }
}