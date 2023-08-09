import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list, int n) {
    ArrayList<Integer>result = new ArrayList<>();
        for (int i = n; i < num_list.length; i++) {
        result.add(num_list[i]);
        }
        for (int j = 0; j < n; j++) {
        result.add(num_list[j]);
        }
        int[] answer = new int[result.size()];
        for (int a = 0; a < result.size(); a++) {
            answer[a] = result.get(a);
        }
        return answer;
    }
}