class Solution {
    public int[] solution(int n) {
        int[] answer;
        int length = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                length++;
            }
        }
        
        answer = new int[length];
        int count = 0;
        
        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                answer[count++] = j;
            }
        }
        
        return answer;
    }
}