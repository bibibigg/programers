import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String result = "";
        String[] arr = String.valueOf(n).split(""); //long형식을 string으로 변환후 배열에 저장
        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순으로 정렬
        for (String s : arr) {
            result += s; // 배열을 String변수에 저장
        }
        answer = Long.parseLong(result); // String형식을 Long으로 변환
        return answer;
    }
}