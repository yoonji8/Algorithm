import java.util.*;
import java.util.regex.*;
class Solution {
    public int solution(String str1, String str2) {
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        for(int i=0; i<str1.length()-1; i++) {
            String s = String.valueOf(str1.charAt(i)) + String.valueOf(str1.charAt(i+1));
            if(Pattern.matches("^[a-zA-Z]*$", s)) {
                list1.add(s);
            }
        }
        
        for(int i=0; i<str2.length()-1; i++) {
            String s = String.valueOf(str2.charAt(i)) + String.valueOf(str2.charAt(i+1));
            if(Pattern.matches("^[a-zA-Z]*$", s)) {
                list2.add(s);
            }
        }
        
        int intersection = 0;
        int union = 0;
        
        for (String s : list1) {
            if (list2.remove(s)) {
                intersection++;
            }
            union++;
        }
        
        union += list2.size();
        
        double temp = 0;

        if (union != 0) {
            temp = (double)intersection/union;
        } else {
            temp = 1;
        }
        
        return (int)(temp*65536);
    }
}