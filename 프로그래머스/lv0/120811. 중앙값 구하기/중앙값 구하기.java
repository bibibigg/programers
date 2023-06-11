import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array); // array배열을 오름차순으로 정렬
        return array[array.length / 2]; //오름차 순으로 정렬된 array배열[배열길이 /2] 를 하여 array배열의 중앙값 리턴
    }
}