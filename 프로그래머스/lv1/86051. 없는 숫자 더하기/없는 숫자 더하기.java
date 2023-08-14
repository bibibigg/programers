import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
class Solution {
    public int solution(int[] numbers) {
        int[] fullnumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int answer = 0;

        ArrayList<Integer> set = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        
         for (int num : numbers) {
            set.add(num);
        }

        for (int num : fullnumbers) {
            if (!set.contains(num)) {
                resultList.add(num);
            }
        }
        
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        
        for (int i : resultArray) {
            answer += i;
        }
        
        return answer;
    }
}