class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        
        answer = new int[count];//길이설정 arr배열값을 더한값으로 배열길이 설정
        int index = 0;
            
        for (int j = 0; j < arr.length; j++) {
            for (int a = 0; a < arr[j]; a++) {
                answer[index++] += arr[j];
            }
        }
        //배열에서 5가 주어지면 answer배열에 5를 5번입력
        
        return answer;
    }
}