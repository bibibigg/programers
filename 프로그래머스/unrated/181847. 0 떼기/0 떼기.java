class Solution {
    public String solution(String n_str) {
        String answer = "";
        while (true) {
            if (n_str.startsWith("0")) {
                n_str = n_str.substring(1);
            } else {
                break;
            }
        }
        answer = n_str;
        return answer;
    }
}