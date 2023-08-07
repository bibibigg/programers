class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] numarr = number.split("");
        for (int i = 0; i < numarr.length; i++) {
            answer += Integer.parseInt(numarr[i]);
        }
        answer %= 9;
        return answer;
    }
}