class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
       int[] answer = new int[2];
        
        // 두 분수의 공통분모 구하기
        int commonDenom = denom1 * denom2;
        // 두 분수를 합산한 결과의 분자를 구하기
        int commonNumer = numer1 * denom2 + numer2 * denom1;

        // 최대공약수 계산
        int gcd = gcd(commonNumer, commonDenom);

        // 기약분수로 변환
        answer[0] = commonNumer / gcd;
        answer[1] = commonDenom / gcd;

        return answer;
    }
    
     private int gcd(int a, int b) { // 유클리드 알고리즘을 사용하여 최대공약수를 구함
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}