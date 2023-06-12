class Solution {
    public int[] solution(int n) {
        int[] answer = new int [(n + 1) / 2];
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { // 조건문으로 인해서 짝수는 들어가지 않음
                answer[i/2] = i; //i/2를 해줌으로써 홀수인 i가 차례대로 배열에 들어감
            }
        }
        return answer;
    }
}