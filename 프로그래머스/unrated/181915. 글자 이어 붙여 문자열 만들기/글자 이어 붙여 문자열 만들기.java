class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        // answer에 index_list의 배열에서 인덱스 값을 구한뒤 my_string의 문자열인덱스번호에 있는 문자 추출
            for (int i = 0; i < index_list.length; i++) {
                int j = index_list[i];
                answer += my_string.substring(j,j + 1);
            }
        return answer;
    }
}