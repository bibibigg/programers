import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger biga = new BigInteger(a);
        BigInteger bigb = new BigInteger(b);
        
        BigInteger result = biga.add(bigb);
        answer = result.toString();
        
        return answer;
    }
}