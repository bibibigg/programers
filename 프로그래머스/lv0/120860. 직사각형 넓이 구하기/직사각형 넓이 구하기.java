class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        // 열값만 추출하여 x좌표차 계산
        // 행값만 추출하여 y좌표차 계산
        // 두 값을 곱해줌
                    int x1 = dots[0][0]; //dots배열의 처음 x값
                    int x2 = 0;
        int resultX = 0;
        int y1 = dots[0][1];//dots배열의 처음 y값
        int y2 = 0;
        int resultY = 0;
        for (int i = 1; i < dots.length; i++) {

            if (x1 != dots[i][0]) { //x값이 다를시 그 값을 x2변수에 저장
                x2 = dots[i][0];
            }
            resultX = Math.abs(x1 - x2); // 두 x값의 차이를 절대값으로 계산
        }
        
         for (int j = 1; j < dots[0].length; j++) {

            if (y1 != dots[j][1]) {
                y2 = dots[j][1];
            }
            resultY = Math.abs(y1 - y2);
        }
        answer = resultX * resultY;
        
        return answer;
    }
}