class Solution {
    public int solution(int number, int limit, int power) {     
        int sum = 0;
        
        for(int i=1; i<=number; i++) {
            int a = 0;
            for(int j=1; j*j<=i; j++) {
                if(j*j == i){
                    a++;
                }else if(i%j == 0){
                    a+=2;
                }
            }
            
            if(a > limit) {
                a = power;
            }
            sum += a;
        }
        return sum;
    }
}