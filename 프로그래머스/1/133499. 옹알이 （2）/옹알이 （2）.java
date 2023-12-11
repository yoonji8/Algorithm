import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr1 = {"aya","ye","woo","ma"};
        String[] arr2 = {"ayaaya","yeye","woowoo","mama"};

        for(String s : babbling){
            for(int i=0; i<arr1.length; i++){
                if(s.contains(arr2[i])){
                    continue;
                }
                s = s.replace(arr1[i], " ");

            }
            if(s.trim().length()==0){
                answer++;
            }
        }
        
        return answer;
    }
}