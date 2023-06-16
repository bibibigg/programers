class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 6; 
        int count = 1;
        if (n == pizza) { 
            answer = 1; 
        } else {
           while((pizza % n) != 0) { 
               pizza += 6; 
               count++;
           } 
        answer = count; 
        }
        return answer;
    }
  }
