class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int counts = 0;
        int county = 0;
        if (!s.contains("p") && !s.contains("y")) {
            answer = true;
            return answer;
            }
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                counts++;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                county++;
            }
        }

        if (counts == county) {
            answer = true;
        } else {
            answer = false;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}