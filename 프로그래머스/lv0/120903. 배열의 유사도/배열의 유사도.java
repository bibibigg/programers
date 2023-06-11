class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int i2 = 0; i2 <s2.length; i2++) {
                if (s1[i].equals(s2[i2])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}