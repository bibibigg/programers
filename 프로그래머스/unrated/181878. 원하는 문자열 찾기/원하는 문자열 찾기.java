class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toLowerCase(); // contains는 대소문자를 구분하기에 contains사용전 소문자로 변환 
        pat = pat.toLowerCase();
        if (myString.contains(pat)) {
            answer = 1;
        } 
        return answer;
    }
}