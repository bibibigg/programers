import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int num, int total) {
        List<Integer> answerList = new ArrayList<>();
        //연속된 정수의 합=12
        //연속된 수는 n, n은 중복x
        //ex
        //x + (x+1) + (x+2) = 12
        //3x+3 = 12
        //x = 3
        //x + x+1 x+2 x+3 x+4 = 15
        //5x+10 = 15
        //x = 1
        //마지막 x+4는 x+num-1로 할수 있음
        //처음부터 num을 구하는 것은 반복문으로 0부터 1씩증가하여 num-1까지로 구하기
        //num * x + a = total;
        //x = total - a / num;
        //ex
        //5 * x + 10 = 15;
        //x = 15 - 10 / 5
            int a = 0;
        for (int i = 0; i <= num-1; i++) {
            a += i;
        }
        
        int x = (total - a) / num;
        
        for (int j = 0; j < num; j++) {
            answerList.add(x + j);
        }

         int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}