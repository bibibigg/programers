import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        if ((numbers[0] * numbers[1]) > numbers[numbers.length -1] * numbers[numbers.length -2]) {
            answer = numbers[0] * numbers[1];
        } else {
            answer = numbers[numbers.length -1] * numbers[numbers.length -2];
        }
        // 음수최대값으로 곱한것과 양수 최댓갑 곱을 비교
        
        
        return answer;
    }
}