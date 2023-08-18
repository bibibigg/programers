import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Comparator.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        
        
        return answer;
    }
}