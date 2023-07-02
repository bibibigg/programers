class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strarr = my_string.split("[a-zA-Z]"); //대소문자를 기준으로 분할 
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].isEmpty()) { //배열에 널값이 있을시 answer에 0을 더해줌
                answer += 0;
            } else {
                answer += Integer.parseInt(strarr[i]);
            }
            
        }
        return answer;
    }
}