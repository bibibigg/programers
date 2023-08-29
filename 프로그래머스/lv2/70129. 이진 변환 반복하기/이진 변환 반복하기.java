class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int leng = 0;
        int count = 0;
        while (s.length() > 1) {
            count++;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    cnt++;
                }
            }
            s = s.replace("0", "");
            leng = s.length();
            s = Integer.toBinaryString(leng);
        }
        answer[0] = count;
        answer[1] = cnt;
        return answer;
    }
}