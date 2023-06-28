import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int[] intarr = {a, b, c, d};
        Arrays.sort(intarr);        
        
        //모두 같을 때
        if(intarr[0] == (intarr[3])) {
            p = intarr[0];
            answer = 1111 * p;
        }
       
        //하나만 다를때
        if (intarr[0] == intarr[1] && intarr[1] == intarr[2] && intarr[2] != intarr[3] ) {
                    p = intarr[0];
                    q = intarr[3];
                    answer = (10 * p + q);
                    answer = answer * answer;
        } else if(intarr[0] != intarr[1] && intarr[1] == intarr[2] && intarr[2] == intarr[3]) { 
                p = intarr[1];
                q = intarr[0];
                answer = (10 * p + q);
                answer = answer * answer;
        }
        
        //두개씩 같을때
        if(intarr[0] == intarr[1] && intarr[1] != intarr[2] && intarr[2] == intarr[3]) {
            p = intarr[0];
            q = intarr[2];
            answer = (p + q) * Math.abs(p - q);
        }
        
        //두개만 같고 나머지는 다 다른수일때
        if(intarr[0] == intarr[1] && intarr[1] != intarr[2] && intarr[2] != intarr[3]) {
            q = intarr[2];
            r = intarr[3];
            answer = q * r;
        } else if(intarr[0] != intarr[1] && intarr[1] == intarr[2] && intarr[2] != intarr[3]) {
            q = intarr[0];
            r = intarr[3];
            answer = q * r;
        } else if (intarr[0] != intarr[1] && intarr[1] != intarr[2] && intarr[2] == intarr[3]) {
            q = intarr[0];
            r = intarr[1];
            answer = q * r;
        }
        
        
        //모두 다를 때
        if(intarr[0] != intarr[1] && intarr[1] != intarr[2] && intarr[2] != intarr[3] ) {
                    answer = intarr[0];
            }
        
        
        // 1. 첫번째 조건 4개의 변수가 모두 같을 시 1111 * 아무 변수
        // 2. 두번째 조건 4개의 변수중 3개가 같고 하나가 다를시 (10 x 3개의 변수중 하나 + 나머지 하나)^2 Math.pow사용
        // 3. 세번째 조건 4개의 변수중 두개씩 같은값일시 (변수 + 다른변수) * Math.abs(변수 - 다른변수)
        // 4. 네번째 조건 4개의 변수중 두개는 같은값, 나머지 변수들은 서로 다른값일시 다른값 * 다른값
        // 5. 다섯번째 조건 4개의 변수가 모두 다를 시 가장 작은 숫자 리턴
        return answer;
    }
}