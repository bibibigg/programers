class Solution {
    public String solution(String myString) {
        String answer = "";
            for (int i = 0; i < myString.length(); i++) {
                char c = myString.charAt(i);
                if (c == 'a') {
                    answer += Character.toUpperCase(c);
                    // answer += String.valueOf(c);
                } else if (c != 'A'){
                   answer += Character.toLowerCase(c);
                       // answer += String.valueOf(c);
                } else if ( c == 'A') {
                    answer += c;
                }
            }
        return answer;
        }
    }