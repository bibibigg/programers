class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) { //1부터 n까지 증가하면서 약수를 구할 수
            int count = 0;// 카운트 변수 선언 및 초기화
            for (int j = 1; j <= i; j++) { //i를 j로 나누어서 약수가 3개 이상이 있는지 구하기
                if (i % j == 0) {//약수일때마다 count증가
                    count++;
                }
            }
            if (count >= 3) {//안의 for문에서 count가 3이하 answer를 증가시키지 않고 count변수 초기화
                answer++;
            }
        }
        return answer;
    }
}