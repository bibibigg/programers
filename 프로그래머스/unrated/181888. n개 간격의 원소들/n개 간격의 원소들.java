class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer;
        int count = 0;
        
        if(num_list.length % n == 0) {
            answer = new int[num_list.length / n];
        } else {
            answer = new int[num_list.length / n + 1];
        }
        
        for (int i = 0; i < num_list.length; i += n) {// i은 0부터 배열길이까지 n의 크기만큼 커지면서 n의 간격원소 출력
            answer[count++] = num_list[i];
        }
        return answer;
    }
}