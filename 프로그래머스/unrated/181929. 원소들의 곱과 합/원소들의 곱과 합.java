class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int i = 0;
        int a = 1;
        int b1 = 0;
        int b2 = 0;
       int n = num_list.length;
        
        for(i = 0; i < n; i++){
            a = a * num_list[i];
            b1 = b1 + num_list[i];
        }
        
         b2 = (int) Math.pow(b1, 2);
        
        if(a < b2){
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}