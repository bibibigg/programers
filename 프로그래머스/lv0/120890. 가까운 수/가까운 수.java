import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] resultarr = new int[array.length];
        //n만큼 뺀 수를 배열에 저장 후배열에서 가장 작은수의 인덱스 값을 구해서 array배열에 적용하기 위해 배열 생성
        
        Arrays.sort(array); // 정렬을 한 이유는 arr배열에 10과 15가 있고 n이 5일시 이중 가까운 수는
                            // 10 과 15 둘다 편차가 5로 같다
                            // 문제 조건에서 가장 가까운 수가 여러개일 경우 더 작은수를 return하라 하였기에 정렬!!
        
        for(int i = 0; i < array.length; i++) {
            if (n > array[i]) { //조건문을 사용하여 음수가 나오지 않게 조정
                resultarr[i] = n - array[i];
            } else {
                resultarr[i] = array[i] - n;
            }
            
        }
        
        int minIndex = 0; //resultarr에 담긴 수에서 가장 작은 수의 인덱스 값
        int minValue = resultarr[0]; //가장 작은수의 초기값을 resultarr[0]의 값으로 줌
        
        for (int j = 1; j < resultarr.length; j++) {
            if (resultarr[j] < minValue) { // 초기값과 resultarr[j]을 비교
                minValue = resultarr[j]; // 작을경우 minValue에 resultarr[j]을 저장하여 가장작은수 최신화
                minIndex = j; // 가장 작은수의 인덱스 값은 j
                              // 가장 가까운 수가 여러개일 경우 조건문에 맞지 않기에 여러개중 제일 작은수가 리턴
            }
        }
        
        answer = array[minIndex];
        
        // 배열순서에서 n만큼 빼서 가장 작은수가 n과 가장 가까운수
        // 가장 작은 수를 어떻게 나타낼 것인지?
        //n만큼 뺀 수를 배열에 저장 후 배열에서 가장 작은수의 인덱스 값을 구해서 array배열에 적용후 출력?
        return answer;
    }
}