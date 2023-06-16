class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 6; //피자 한판은 6조각
        int count = 1;
        if (n == pizza) { //사람인원 / 6조각 == 1판 
            answer = 1; // 1판 리턴
        } else {
           while((pizza % n) != 0) { // n 나누기 피자조각의 나머지가 0이 아닐시
               pizza += 6; // 피자1판 추가
               count++;
           } 
        answer = count; 
        }
        return answer;
    }
  }
