class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strarr = my_string.split(" "); //공백을 기준으로 배열자르기
        answer = Integer.parseInt(strarr[0]); // answer에는 배열 처음값을 설정
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].equals("+")) { // strarr[i]가 "+" 문자일시
                answer += Integer.parseInt(strarr[i+1]); // answer + "+"가나온 다음 배열값을 더해준다
            } else if (strarr[i].equals("-")) { // strarr[i]가 "-" 문자일시
                answer -= Integer.parseInt(strarr[i+1]); // answer - "-"가나온 다음 배열값을 빼준다
            }
        }
        return answer;
    }
}