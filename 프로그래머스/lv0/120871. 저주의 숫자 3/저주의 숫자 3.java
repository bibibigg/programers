class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        while (n > 0) {
            if (cnt % 3 == 0 || Integer.toString(cnt).contains("3")) {
                cnt++;
                continue;
            }

            answer = cnt;
            cnt++;
            n--;
        }
        return answer;
    }
}