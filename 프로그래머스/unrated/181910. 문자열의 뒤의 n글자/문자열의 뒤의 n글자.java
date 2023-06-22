class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int startIndex = (my_string.length() - n);
        // 문자열길이 - n을하여 시작인덱스부터 n까지 출력
        //     시작인덱스 부터 my_string.length()까지
            answer = my_string.substring(startIndex, my_string.length());
        return answer;
    }
}