
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int plus = x;

        for (int i = 0; i < n; i++) {
                answer[i] = x*((long)i+1) ;
            
        }

        return answer;
    }
}