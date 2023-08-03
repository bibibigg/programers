
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> result = new ArrayList<>();
        
        String[] answer = {};
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                result.add(strArr[i]);
            }
        }
        
        answer = result.toArray(new String[0]);
        
        return answer;
    }
}