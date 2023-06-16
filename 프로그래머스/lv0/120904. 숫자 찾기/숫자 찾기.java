class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String ks = String.valueOf(k);
        String a = String.valueOf(num);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ks.charAt(0) ) {
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}