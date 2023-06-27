import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] beforestr; // before의 순서를 바꾸어 after를 만들 수 있다는 것은
                            // berfore과 after가 완전히 동일한 문자열이라는 의미이기에 두 문자열이 같은지 비교하기위해서
        String[] afterstr;  // 배열에 문자열을 split을 이용하여 담은 후 정렬하여 비교
        
        beforestr = before.split("");
        afterstr = after.split("");
        
        Arrays.sort(beforestr);
        Arrays.sort(afterstr);
        
        String result1 = String.join("", beforestr); //join을 사용하여 정렬한 배열을 다시 문자열로 가져오기 위함
        String result2 = String.join("", afterstr);
        
        if (result1.equals(result2)) {
            answer = 1;
        }
        return answer;
    }
}