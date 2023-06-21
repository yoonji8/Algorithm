class Solution {
    boolean solution(String s) {
        String ss = s.toLowerCase();
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < ss.length(); i++) {
            char c = ss.charAt(i);
            if(c=='p'){
                count1++;
            } else if (c=='y') {
                count2++;
            }
        }

        if(count1==count2){
            return true;
        }else{
            return false;
        }
    }
}