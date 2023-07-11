class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        boolean check = false;

        for (String word : dic) {
            int count = 0;
            for (String str : spell)
            if (word.contains(str)) {
                count++;
            }
            if (count == spell.length) {
                check = true;
                break;
            }
        }
        return check ? 1 : 2;
    }
}