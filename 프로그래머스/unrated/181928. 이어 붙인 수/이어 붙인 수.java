class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < num_list.length; i++) { //인덱스 길이만큼 반복
            if (num_list[i] % 2 == 1) { // num_list[i]가 홀수일시 str1변수에 문자열로 저장 
                str1 += "" + num_list[i];
            } else { // num_list[i]가 홀수가 아닐시(짝수일시) str2변수에 문자열로 저장
                str2 += "" + num_list[i];
            }
        }
        answer = Integer.parseInt(str1) + Integer.parseInt(str2); // 저장된 문자열을 정수로 변환 후 더하기
        // 홀수 인덱스를 문자열로 변환후 합치기 ex)"351"
        //     짝수 인덱스를 문자열로 변환후 합치기 ex)"42"
        //     두 변수를 정수로 변환 후 더하기
            
        return answer;
    }
}