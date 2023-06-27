class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] lettermorse;
        lettermorse = letter.split(" ");
        
        for (String s : lettermorse) {
            for (int i = 0; i < morse.length; i++) {
                if (s.equals(morse[i])) {
                    answer += Character.toString(i + 'a');
                }
            }
        }
        // a~z에 해당하는 모스부호 배열 저장
        // letter의 모스부호를 다른 배열에 저장
        // 반복문과 조건문을 통해 letter[i] 가 a~z모스부호 배열을 비교하면서 같은 것이 있을 시 answer에 저장
        return answer;
    }
}