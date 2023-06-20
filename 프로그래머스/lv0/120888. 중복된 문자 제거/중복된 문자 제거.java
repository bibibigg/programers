import java.util.Arrays;
import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split(""); //문자열을 배열로 전환하여 각 인덱스마다 문자입력
        LinkedHashSet<String> set = new LinkedHashSet<> (Arrays.asList(str));
        
         answer = String.join("", set);
        
        return answer;
    }
}