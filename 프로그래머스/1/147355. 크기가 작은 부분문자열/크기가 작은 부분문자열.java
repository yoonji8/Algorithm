class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        
        for(int i=0; i<t.length()-len+1; i++){
            String str;
            str = t.substring(i,i+p.length());
            long t_num = Long.parseLong(str);
            long p_num = Long.parseLong(p);
            
            if(t_num <= p_num){
                answer++;
            }
        }
        return answer;
    }
}