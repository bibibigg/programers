class Solution {
    public long solution(long n) {
        long answer = 0;
        long result = (long)Math.sqrt(n);
        if (Math.pow(result,2) == n) {
            result++;
            answer = (long)Math.pow(result,2);
        } else {
            answer = -1;
        }
        return answer;
    }
}