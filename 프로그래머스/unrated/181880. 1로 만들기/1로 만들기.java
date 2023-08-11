class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            int cnt = 0;
            result = num_list[i];
            
            while(result > 1) {
                if (result % 2 == 0) {
                    result /= 2;
                    cnt++;
                } else {
                    result = (result - 1) / 2;
                    cnt++;
                }
            }
            answer += cnt;
        }
        
        return answer;
    }
}