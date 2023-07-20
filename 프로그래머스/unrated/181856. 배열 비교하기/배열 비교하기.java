class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr2.length > arr1.length) {
            answer = -1;
        } else if (arr2.length < arr1.length) {
            answer = 1;
        } else {
            int arr1result = 0;
            int arr2result = 0;
            for (int i = 0; i < arr1.length; i++) {
                arr1result += arr1[i];
                arr2result += arr2[i];
            }
            if (arr1result > arr2result) {
                answer = 1;
            } else if (arr1result < arr2result) {
                answer = -1;
            } else {
                answer = 0;
            }
        }
        
        return answer;
    }
}