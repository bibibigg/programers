class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        for (int i = 1; i <= k; i++) {
            answer = numbers[index];
            if (index > numbers.length-1) {
                index = 0;
            } else if (index == numbers.length-1) {
                index = 1;
            } else {
                            index = (index + 2) % numbers.length;
            }

        }
        return answer;
    }
}