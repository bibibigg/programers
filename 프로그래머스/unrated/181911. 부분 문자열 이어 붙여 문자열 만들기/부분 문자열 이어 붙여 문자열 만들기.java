class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i = 0; i < my_strings.length; i++) {
            int start = parts[i][0]; // 잘라내기 시작 인덱스
            int end = parts[i][1] + 1;   // 잘라내기 끝 인덱스
            // end의 인덱스는 포함하지 않기에 +1을 하여 끝 인덱스까지 포함
            answer += my_strings[i].substring(start, end); 
        }
        return answer;
    }
}