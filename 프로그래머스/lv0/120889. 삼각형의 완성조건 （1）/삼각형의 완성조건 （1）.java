import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if (sides[2] < (sides[0] + sides[1])) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        // 1. 오름차순으로 정렬
            // 2. 마지막 인덱스의 숫자는 제일 큰 수
            // 3.마지막 인덱스를 제외한 두 수의 합과 마지막 인덱스 비교
            // 마지막 수가 작을 시 1 같거나 클 시 2 
        return answer;
    }
}