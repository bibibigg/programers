class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int a = box[0] / n;
        int b = box[1] / n;
        int c = box[2] / n;
        answer = a * b * c;
  
//         주사위의 길이와 상자의 가로  세로 높이를 비교해야함
//             가로에 들어가는 개수 = box[0] / n;
//             세로에 들어가는 개수 = box[1] / n;
//             높이에 들어가는 개수 = box[2] / n;
//         총 개수 = 위 새변수곱
            
        return answer;
    }
}