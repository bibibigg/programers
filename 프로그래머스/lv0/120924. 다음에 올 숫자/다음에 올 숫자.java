class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int a = common[1] - common[0];
        
        
        //등차수열 혹은 등비수열이 아닌경우는 없음
            if (common[2] - common[1] == a) { // 등차수열일 경우
            answer = a + common[common.length-1];
        } else { // 거짓일경우 등비수열
                int b = common[2] / common[1];
            answer= b * common[common.length-1];
        }
    
        
        return answer;
    }
}