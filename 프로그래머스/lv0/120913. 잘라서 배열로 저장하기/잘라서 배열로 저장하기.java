class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        answer = my_str.split("(?<=\\G.{" + n+ "})");
        // 정규표현식 사용
        // (?<=...)의 의미 : 전방탐색양식
        
        return answer;
    }
}