class Solution {
    public int solution(String s) {
        int answer = 0;
        if (s.charAt(0) == '-') {
            answer = Integer.parseInt(s.substring(1)) * (-1); // 음수 부호일경우 음수변환을 제대로 처리하지 못하기에 substring을 이용하여 부호 뒤에만 정수형으로 바꾸어주고 -1을 곱하여 음수처리
        } else {
            answer = Integer.parseInt(s);
        }
        
        return answer;
    }
}