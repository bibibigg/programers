class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        if (M * N == 1) {
            answer = 0;
        } else {
            answer = (M * N) - 1;
            
        }
        return answer;
    }
}