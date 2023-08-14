import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int[] result = arr.clone();
        Arrays.sort(result);
        int c = result[0];
        ArrayList<Integer> list = new ArrayList<>();
        
        if (arr.length > 1) {
            int[] answer = new int[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == c) {
                    continue;
                } else {
                    list.add(arr[i]);
                }
            }
        } else {
            int[] answer = {-1};
            return answer;
        }

               int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}