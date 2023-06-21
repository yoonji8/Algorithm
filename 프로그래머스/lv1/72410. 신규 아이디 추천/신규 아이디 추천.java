class Solution {
    public String solution(String new_id) {
        String step1 = new_id.toLowerCase();

        StringBuilder sb1 = new StringBuilder();
        char[] arr = step1.toCharArray();
        for(char ch : arr){
            if( Character.isLowerCase(ch) ||
                    Character.isDigit(ch) ||
                    ch =='-' || ch =='_' || ch =='.' ){
            sb1.append(ch);}
        }
        String step2 = sb1.toString();

        String step3 = step2.replace("..", ".");
        while (step3.contains("..")) {
            step3 = step3.replace("..", ".");
        }
        
        String step4 = step3;
        if (step4.length() > 0) {
            if (step4.charAt(0) == '.') {
                step4 = step4.substring(1, step4.length());
            }
        }
        if (step4.length() > 0) {
            if (step4.charAt(step4.length() - 1) == '.') {
                step4 = step4.substring(0, step4.length() - 1);
            }
        }

        String step5 = step4.isEmpty() ? "a" : step4;
        String step6 = step5;
        if(step6.length()>=16){
            step6 = step6.substring(0,15);
            if(step6.charAt(step6.length()-1)=='.'){
                step6 = step6.substring(0,step6.length()-1);
            }
        }
        StringBuilder answer = new StringBuilder(step6);
        if (answer.length() <= 2) {
            while(answer.length()<3){
                answer.append(answer.charAt(answer.length()-1));
            }}

        return answer.toString();
    }
}
