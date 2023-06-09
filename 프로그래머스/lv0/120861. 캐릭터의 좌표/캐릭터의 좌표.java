class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int maxX = ((board[0] -1) / 2);
        int maxY = ((board[1] -1) / 2);
        
        //왼쪽 오른쪽 이동은 행
        //위 아래 이동은 열
        //board는 최대좌표 11,11에서 x좌표는 0을 포함하여 좌우로 5까지만 이동가능 y도 마찬가지
        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "left" :
                    answer[0] -= 1 ;
                    break;
                case "right" :
                    answer[0] += 1;
                    break;
                case "down" :
                    answer[1] -= 1;
                    break;
                case "up" :
                    answer[1] += 1;
                    break;
                    }
                    if (answer[0] > maxX) { // answer가 maxX를 초과할시 -1을 하여 값이 증가하지 않게 함
            answer[0] -= 1;
        } else if (Math.abs(answer[0]) > maxX) { // answer가 -일시 +를 해주어서 값이 증가하지 않게함
            answer[0] += 1;
        } else if (answer[1] > maxY) {
            answer[1] -= 1;     
        } else if (Math.abs(answer[1]) > maxY) {
            answer[1] += 1;
                    }
                }

        return answer;
    }
}