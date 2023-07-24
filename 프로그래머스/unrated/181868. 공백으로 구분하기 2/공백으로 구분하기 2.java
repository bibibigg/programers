import java.util.*;
class Solution {
    public List solution(String my_string) {
        List<String> answer = new ArrayList<>();
        String[] my_string_list = my_string.split(" ");//공백을 기준으로 나누기
        for(int i = 0; i<my_string_list.length;i++){
            if(!my_string_list[i].equals("")){//공백이 아닐시 리스트에 추가
                answer.add(my_string_list[i]);
            }
        }
        return answer;
    }
}