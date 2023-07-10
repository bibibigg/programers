class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        if(my_string.startsWith(is_prefix)) { //startsWith메서드 비교대상 문자열이 입력된 문자열값으로 시작되는지 확인
            answer = 1;
        }
        return answer;
    }
}