class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)){
                answer += str_list[i];
                // answer 에 str_list[i]문자열을 더함                
            }
        }
                // 조건에 해당하지 않을경우 answer 에 str_list[i]를 더하지 않음
        
        return answer;
    }
}