import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] result = s.split(" ");
        int[] str = new int[result.length];
        // "-1" "-2" "-3"
        for (int i = 0; i < result.length; i++) {
            str[i] = Integer.parseInt(result[i]);
        }
        Arrays.sort(str);
        answer = String.valueOf(str[0]) + " " + String.valueOf(str[str.length-1]);
        return answer;
    }
}