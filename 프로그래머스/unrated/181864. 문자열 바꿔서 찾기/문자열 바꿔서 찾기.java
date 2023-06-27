class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String mystr = "";
        String[] str;
        
        str = myString.split("");
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("A")) {
                mystr += "B";
            } else {
                mystr += "A";
            }
        }
        
        if (mystr.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}