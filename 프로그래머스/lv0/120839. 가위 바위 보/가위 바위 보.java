class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '2') {
                answer += "0";
            } else if (rsp.charAt(i) == '0') {
                answer += "5";
            } else if (rsp.charAt(i) == '5') {
                answer += "2";
            }
        }
        // 문자열의 i번째가 2면 0, 0이면 5, 5면 2 -> rsp의 길이만큼 반목
        return answer;
    }
}