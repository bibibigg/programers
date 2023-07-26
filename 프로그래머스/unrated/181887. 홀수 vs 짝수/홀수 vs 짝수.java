class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = num_list[0];
        int b = 0;
        for (int i = 1; i < num_list.length; i++) {
            if (i % 2 == 0) { //홀수번째 원소 합
                a += num_list[i];//홀수일시
            } else { // 짝수번째 원소 합
                b += num_list[i];//짝수일시
            }
        }
        if (a > b) {
            answer = a;
        } else {
            answer = b;
        }
        return answer;
    }
}