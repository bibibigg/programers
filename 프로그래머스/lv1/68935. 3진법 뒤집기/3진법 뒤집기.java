class Solution {
    public int solution(int n) {
        int answer = 0;
        String value = "";
        String num = "";
        
            if (n == 0) {
        return 0; // 0의 3진수 표현은 0입니다.
    }

        StringBuilder result = new StringBuilder();
    while (n > 0) {
        int remainder = n % 3;
        result.insert(0, remainder); // 나머지를 앞에 추가
        n /= 3;
    }
        value = result.toString();
        // value = Integer.parseInt(result.toString());
// n을 3진법으로 변환
        
        for (int j = 0; j < value.length(); j++) {
        int digit = Character.getNumericValue(value.charAt(j));
        answer += digit * Math.pow(3, j);
    }
        
        // for (int j = value.length() - 1; j >= 0; j--) {
        //     num += value.charAt(j);
        // }
        
// 현재 3진법을 문자열 상태인 채로 앞뒤 반전함
        // 문자열상태로 10진법으로 표현
        
        return answer;
    }
}
