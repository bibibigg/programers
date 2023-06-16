class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0; 
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                answer[0] = array[i];
                answer[1] = i;
            }
        }
            // max변수가 arr[i]보다 작을시
            // 다시 max변수에 arr[i]를 넣음
        return answer;
    }
}