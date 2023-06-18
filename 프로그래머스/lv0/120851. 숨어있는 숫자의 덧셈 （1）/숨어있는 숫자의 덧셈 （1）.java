class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // replaceAll로 1부터 9까지의 한자리 자연수를 제외한 나머지 지우기
        //     split으로 하나씩 배열로 옮기기
        //     for문으로 배열의 첫번째부터 마지막까지 더하기
        // 더할때 문자열로 바꾼 배열을 정수형으로 바꾸어서 더하기
        my_string = my_string.replaceAll("[a-z]" ,"");
        my_string = my_string.replaceAll("[A-Z]" ,"");
        String[] arr = my_string.split("");
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}