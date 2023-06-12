class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String s = letter;
        answer = my_string.replace(s, "");
        return answer;
    }
}