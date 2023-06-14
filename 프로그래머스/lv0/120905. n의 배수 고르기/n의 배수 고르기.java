import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int c = 0;
        int[] arr = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                arr[c] = numlist[i];
                c++;
            }
          }  
        int[] answer = new int[c];
        for (int j = 0; j < c; j++) {
               answer[j] = arr[j];
            }
            
        return answer;
    }
}