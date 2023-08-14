class Solution {
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0) {
            int leng = (s.length() / 2) -1 ;
             answer = s.substring(leng, leng + 2);
            
        } else {
            int leng = s.length() / 2;
            answer = s.substring(leng, leng+1);
        }
        return answer;
    }
}
