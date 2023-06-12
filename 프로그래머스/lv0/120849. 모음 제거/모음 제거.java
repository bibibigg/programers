class Solution {
    public String solution(String my_string) {
        String answer = "";
        String o = "aeiou";
        for (int i = 0; i < o.length(); i++) {
            for (int a= my_string.length() -1 ; a >= 0; a--) {
            if (o.charAt(i) == my_string.charAt(a)) {
                my_string = my_string.substring(0, a) + my_string.substring(a + 1);
            }
                }
        }
        answer = my_string;
        return answer;
    }
}