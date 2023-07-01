class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        // emergency의 배열을 돌면서 응급도가 높은 순대로 번호 찍기
       for (int i = 0; i < emergency.length; i++) { //이중for문으로 배열의 한 인덱스와 나머지 배열을 비교하기
           for (int j = 0; j < emergency.length; j ++) { //i는 고정되고 j가 배열 전체를 돌면서 i와 나머지 배열 비교
               if (emergency[i] < emergency[j]) { // 조건문으로 emergency[i] 와 emergency[j]를 비교 작을시 응급도 높임
                   answer[i]++;  
               }
           }
           answer[i]++; // 여기서 answer[i]++을 해주는 이유는 가장 큰값은 응급도가 0인상태이기에 전체를 1씩 높여서 맞추기
       }
        
        return answer;
    }
}