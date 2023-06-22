class Solution {
    public int[] solution(int n, int k) {
        int count = 0;
        int countk = k;
        while(countk <= n) {
            count++;
            countk += k;
        }
        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = (i + 1) * k; //k의 배수를 배열 i번째에 넣기
        }
        return answer;
    }
}