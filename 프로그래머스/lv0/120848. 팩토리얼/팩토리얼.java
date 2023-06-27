class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 10; i++) {
            if (n >= factorial(i)) {
                answer = i;
            } else {
                break;
            }
        }

        return answer;
    }
    
    static int factorial(int value) {
        if (value == 1) {
            return 1;
        }
        return factorial(value - 1) * value;
    }
}