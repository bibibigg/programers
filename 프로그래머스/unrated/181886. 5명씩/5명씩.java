import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String[] names) {
        String[] answer;
        ArrayList<String> resultList = new ArrayList<>();
        
        //answer[0] = names[0];
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                resultList.add(names[i]);
            }
        }
        
        answer = resultList.toArray(new String[0]);
        return answer;
    }
}