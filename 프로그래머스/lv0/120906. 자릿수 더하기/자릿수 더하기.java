class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = "";
        a = String.valueOf(n); //a변수에 정수형을 문자열로 변환하여 저장 ex)1234 -> "1234"
        for (int i = 0; i < a.length(); i++) {
        answer += Integer.parseInt(a.substring(i,i+1)); // substring을 사용하여 문자열 첫번째 가져오기
        }
        return answer;
    }
}