class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] arr = binomial.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("+")) {
                answer = Integer.parseInt(arr[i-1]) + Integer.parseInt(arr[i+1]);
                break;
            } else if (arr[i].equals("-")) {
                answer = Integer.parseInt(arr[i-1]) - Integer.parseInt(arr[i+1]);
                 break;
            } else if (arr[i].equals("*")) {
                answer = Integer.parseInt(arr[i-1]) * Integer.parseInt(arr[i+1]);
                 break;
            }
        }
        return answer;
    }
}