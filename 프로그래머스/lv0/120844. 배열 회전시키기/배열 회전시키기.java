class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            int temp = numbers[numbers.length-1]; // 마지막 배열값을 임시변수에 넣기
            for (int i = numbers.length-2; i >= 0; i--) { //마지막 배열전 배열부터 첫번째 배열까지 반복
                answer[i+1] = numbers[i]; //answer의 마지막 배열에 그 전 배열값을 넣어서 오른쪽으로 밀기
            }
            answer[0] = temp; // 첫번쨰 배열에는 마지막 배열값 넣기
        } else {
            int temp = numbers[0]; // 첫번째 배열값을 임시변수에 넣기
            for (int i = 0; i <= numbers.length-2; i++) { // 첫번째 배열부터 마지막 전배열까지 반복
                answer[i] = numbers[i+1]; //첫번째 배열에 다음 배열값을 넣어서 왼쪽으로 당기기
            }
            answer[numbers.length-1] = temp; // 마지막 배열에는 첫번째 배열값 넣기
        }
        // right일시 i번째 배열을 i+1을 다음 배열로 이동
        //     제일 끝에있는 배열은 맨 처음 배열[0]으로 이동
        // left일시 맨 처음 배열을 매 끝으로 이동
        //     i번째 배열을 i-1을 하여 전 배열로 이동;
        return answer;
    }
}