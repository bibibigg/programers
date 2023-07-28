import java.util.Arrays;
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int[] answerarr = {a,b,c};
        Arrays.sort(answerarr);
        if (a != b && a != c &&  b != c) {// a,b,c가 모두 다른겨우
            answer = a + b + c;
        } else if (answerarr[0] == answerarr[1] && answerarr[1] == answerarr[2]) { // 세 숫자가 모두 같은 경우
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else { // 두 숫자는 같고 나머지 숫자가 다른 경우
            answer = (a + b + c) * (a * a + b * b + c * c);
        }
        return answer;
    }
}