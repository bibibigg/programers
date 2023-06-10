class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            i++;
            answer += i;
        }
        return answer;
    }
}