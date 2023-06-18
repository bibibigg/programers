import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        //copyOfRange를 이용하여 배열을 복사하여 다른 변수에 저장
        //(arr, from, to) 형식으로 arr에는 복사할 배열, form은 복사할 배열의 시작인덱스, to에는 복사할 배열의 인덱스 전까지
        //의 의미
        return answer;
    }
}