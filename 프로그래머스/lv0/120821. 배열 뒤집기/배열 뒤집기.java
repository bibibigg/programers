class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length-i-1];
            //answer의 배열에 num_list.length-1-i을 하여 배열의 마지막의 값을 넣고 다음에는 마지막 전값을 넣을 수 있도록
            // for문의 i변수를 사용
        }
        return answer;
    }
}