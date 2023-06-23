import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer; // 가장 작은 5개의 수를 제외한 나머지 배열 개수
        Arrays.sort(num_list); //가장 작은 5개의 수를 제외한 오름차순을 구하기 위해 정렬
        answer = Arrays.copyOfRange(num_list, 5, num_list.length); // 가장작은 5개의 수 이후의 수를 복사
        return answer;
    }
}