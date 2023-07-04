class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += String.valueOf(array[i]);
        }
        String[] strarr = str.split("");
        
        for (int j = 0; j < strarr.length; j++) {
            if (strarr[j].equals("7")) {
                answer++;
            }
        }
        return answer;
    }
}