class Solution {
    public int solution(int hp) {
        int answer = 0;
        int count = 0;
       
        //hp / 5를 하여 5의 공격력을 가지고 있는 개미의 수를 계산
        count += (hp / 5);
        // hp = hp % 5를 하여 5의 공격력을 가지고 있는 개미들의 공격력을 뺀 나머지 hp계산
        hp = hp % 5;
        
        //위와 같은 방식으로 남은 hp에서 3의 공격력을 가지고 있는 개미의 수를 계산
        count += (hp / 3);
        // 남은 hp에서 3의 공격력을 가지고 있는 개미들의 공격력을 뺀 hp 계산
        hp = hp % 3;
        
        count += (hp / 1);
        return count;
    }
}