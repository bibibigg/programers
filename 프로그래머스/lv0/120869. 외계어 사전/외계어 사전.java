class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        String str = "";
        for (int i = 0; i < spell.length; i++) {
            str += spell[i];
        }
        
        for (int j = 0; j < dic.length; j++) {
            if (dic[j].contains(str)) {
                answer = 1;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}