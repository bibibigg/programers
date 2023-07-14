class Solution {
    public int solution(int chicken) {
        int answer = 0;
        // int bonuscp = chicken % 10; // 서비스 치킨쿠폰을 쓴 남은 쿠폰
        // int rc = serviceChicken + bonuscp; // 남은쿠폰과 서비스 치킨으로 받은 쿠폰의 합
        // int bonusChicken = rc / 10; // 쿠폰의 합으로 시킬수 있는 치킨

        while (chicken >= 10) {
            int serviceChicken = chicken / 10;
            int bonuscp = chicken % 10;
            chicken = serviceChicken + bonuscp;
            answer += serviceChicken;
            
        }
        return answer;
    }
}