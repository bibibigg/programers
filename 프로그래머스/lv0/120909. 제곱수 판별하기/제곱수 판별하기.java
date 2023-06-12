class Solution {
    public int solution(int n) {
        int answer = 0;
        int z = 0;
        z = (int) Math.sqrt(n);
        if (Math.pow(z, 2) == n) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}