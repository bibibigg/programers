class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];// 2차원 배열 행은 num_list.length / n, 열은 n
        
        int count = 0;
        for (int i = 0; i < num_list.length / n; i++) { // 행에 넣어줄 값의 반복
            for (int j = 0; j < n; j++) { //열에 넣어줄 값의 반복
                answer[i][j] = num_list[count++];
            }
        }
        return answer;
    }
}