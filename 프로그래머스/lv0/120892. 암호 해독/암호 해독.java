class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int a = code;
        while(a <= cipher.length()) {
        answer += cipher.substring(a-1,a);
        a = a + code;
        }
        return answer;
    }
}