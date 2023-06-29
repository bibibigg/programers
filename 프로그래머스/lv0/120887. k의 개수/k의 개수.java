class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String value = "";
        String[] answerarr; //split사용전 배열선언
        String strk = String.valueOf(k); //비교할 값인 k를 문자열로 변환
        
        for (int q = i; q <= j; q++) { // i부터 j까지 반복 i는 i는 1씩 증가 
            value = String.valueOf(q); // i의 값을 value에 저장
            if (value.contains(strk)); // value에 k가 포함할 시 split으로 나누어 배열에 저장
            answerarr = value.split(""); //split을 사용하는 이유는 11처럼 i의 값이 연속될때는 answer를 2증가 시키기위함
            for (int index = 0; index < answerarr.length; index++) { //배열 처음부터 배열 끝까지 반복
                if (answerarr[index].equals(strk)) {//배열값이 strk와 같으면 answer를 1증가
                    answer++;
                }
            }
        }
        return answer;
    }
}