import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int x = sides[0] + sides[1]; // 두 변의 길이의 합
        Arrays.sort(sides);

        for (int i = sides[1] + 1 - sides[0]; i <= sides[1]; i++) { // 가장 긴 변이 side[1]인 경우
                
            answer ++; //가장 긴 변은 다른 두 변의 길이의 합보다 작아야한다
            // 최소값 = sides[1] + 1 - sides[0] ->최대변보다 큰값 
        }
        
        for (int j = sides[1] + 1; j < x; j++) { // 나머지 한 변이 가장 긴 경우
                answer++;
        }
        
        return answer;
    }
}