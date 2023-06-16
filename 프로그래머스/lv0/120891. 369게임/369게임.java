class Solution {
    public int solution(int order) {
        int answer = 0;
        String a = String.valueOf(order); // 정수형 문자열로 바꾸기
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '3' || a.charAt(i) == '6' || a.charAt(i) == '9') {
                answer++;
            }
        }
        // 반복문을 돌려서 문자열 첫번째가 3,6,9가 있는지 확인
        // 정수형을 문자열로 바꾼 뒤 문자열에 3,6,9 가 있는지 확인 후 있을때마다 answer에 1씩 더하기
        return answer;
    }
}