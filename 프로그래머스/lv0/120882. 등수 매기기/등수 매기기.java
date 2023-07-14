class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int [] result = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[0].length; j++) {
                result[i] += score[i][j];
            }
        }
        
        for (int c = 0; c < result.length; c++) {
            for (int d = 0; d < result.length; d++) {
                if (result[c] < result[d]) {
                    answer[c]++;
                }
            }
            answer[c]++;
        }
        return answer;
    }
}