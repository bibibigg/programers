import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n) {
        int index = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; n > 1; i++) {
            while (n % i == 0) {
                result.add(i);
                n = n / i ;
              
             } 
        } 
        
        Set<Integer> set = new LinkedHashSet<>(result);// 중복 제거를 위해 set에 추가
        int[] answer = new int[set.size()];
        for (int value : set) {
            answer[index++] = value;
        }
        
        
        
        return answer;
    }
}