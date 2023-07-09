import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        answer = myString.split("x");
         ArrayList<String> resultList = new ArrayList<>();
        
        for (String str : answer) {  //공백문자열은 반환할 배열에 넣지않음
            if (!str.isEmpty()) { //answer를 str에 담아서 str이 공백이 아닐시 리스트에 str을 추가
                resultList.add(str);
            }
        }
        
        // 결과 리스트를 배열로 변환
        answer = resultList.toArray(new String[0]);
        
        Arrays.sort(answer);
        return answer;
    }
}