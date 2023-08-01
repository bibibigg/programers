import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> resultarr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            resultarr.add(arr[i]);
            
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    resultarr.remove(Integer.valueOf(arr[i])); // add할때 Integer객체로 넣었기 때문에
                                                                //Integer객체로 변환하여 제거해야함
                    break;
                }        
            }
        }
        
          int[] answer = new int[resultarr.size()]; // 리스트 사이즈만큼의 배열선언
        for (int i = 0; i < resultarr.size(); i++) {
            answer[i] = resultarr.get(i); // answer배열에 i번째에 있는 리스트값을 저장
        }
        
        return answer;
    }
}