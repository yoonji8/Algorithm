class Solution {
    public int solution(int n) {
        
        int count1 = Integer.bitCount(n);
        
        while(true) {
            n++;
            
            int count2 = Integer.bitCount(n);
            
            if(count1 == count2) {
                break;
            }
        }
        
        return n;
    }
}