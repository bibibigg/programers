import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger answer = BigInteger.ONE;
        if (balls == share) {
            return answer;
        }

        for (int i = 0; i < share; i++) {
            answer = answer.multiply(BigInteger.valueOf(balls - i));
            answer = answer.divide(BigInteger.valueOf(i + 1));
        }

        return answer;
    }
}