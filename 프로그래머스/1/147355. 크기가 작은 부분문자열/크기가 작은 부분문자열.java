class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pleng = p.length();
        int tleng = t.length();
        long pLong = Long.parseLong(p);
        
        
        for (int i = 0; i <= tleng - pleng; i++) {
            String resultString = t.substring(i, i + pleng);
            Long resultLong = Long.parseLong(resultString);
            
            if (resultLong <= pLong) {
                answer++;
            }
        }
        
        
        return answer;
    }
}

// 조건에서 p의 길이는 1부터 18까지이고 p는 문자열로 주어질때 int로 할 시 32비트이기에 최대 10자리의 숫자를 나타냄 18자리의 숫자를 나타내기에 부족하여 p의 길이는 long으로 구함
