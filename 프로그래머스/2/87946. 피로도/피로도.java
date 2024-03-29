class Solution {
    int answer = 0;
    boolean[] check;
    
    public int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];
        dfs(dungeons, 0, k);
        return answer;
    }
    
    void dfs(int[][] dungeons, int depth, int k) {
        for(int i=0; i<dungeons.length; i++){
            if(!check[i] && dungeons[i][0] <= k) {
                check[i] = true;
                dfs(dungeons, depth+1, k-dungeons[i][1]);
                check[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }
}