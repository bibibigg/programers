import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int a = 0;
        int b = 0;
        Arrays.sort(numbers);
        a = numbers.length-1;
        b = numbers.length-2;
        answer = numbers[a] * numbers[b];
            
        return answer;
    }
}