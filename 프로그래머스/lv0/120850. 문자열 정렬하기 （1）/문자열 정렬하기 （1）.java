import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");
        String[] arr = my_string.split("");
        int[] answer = new int[arr.length];
        Arrays.sort(arr);
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
            
        }
        return answer;
    }
}