class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        if (m == 1) {
            return answer = my_string;
        }
        
        while(c <= my_string.length()) {
        answer += my_string.substring(c-1, c);
        c += m;
            }
        return answer;
    }
}