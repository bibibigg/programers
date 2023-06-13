class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                i++;
                answer += i;
            }
        } else {
            for (int i = 1; i < n; i++) {
                i++;
                answer += Math.pow(i,2);
        }
        }
        return answer;
}
}