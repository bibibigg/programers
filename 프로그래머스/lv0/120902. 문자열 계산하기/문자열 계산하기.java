class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strarr = my_string.split(" ");
        answer = Integer.parseInt(strarr[0]);
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].equals("+")) {
                answer += Integer.parseInt(strarr[i+1]);
            } else if (strarr[i].equals("-")) {
                answer -= Integer.parseInt(strarr[i+1]);
            }
        }
        return answer;
    }
}