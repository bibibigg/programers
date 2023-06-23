class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char c = ' ';
        char alpc = alp.charAt(0);
        
        for (int i = 0; i < my_string.length(); i++) {
            c = my_string.charAt(i);
            if (c == alpc) {
                answer += String.valueOf(Character.toUpperCase(c));
            } else {
                answer += String.valueOf(c);
            }
        }
        return answer;
    }
}