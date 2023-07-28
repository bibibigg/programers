import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String myString) {
        List<Integer> resultList = new ArrayList<>();
        int[] answer;
        
        String[] myStringarr = myString.split("x"); //x를 기준으로 문자열 나누기
        
        for (int i = 0; i < myStringarr.length; i++) {
                resultList.add(myStringarr[i].length());
        }
        if (myString.endsWith("x")) {
            resultList.add(0);
        }
        
         answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}