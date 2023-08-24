class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;
        int answer = 0;
        if (n == 1) {
            return answer = 1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]!=arr[j][i]) {
                    return answer = 0;
                } 
            }
        }
        return answer = 1;
    }
}