function solution(n, m) {
    var answer = [];
     // 최대공약수 계산
    var gcd = function(a, b) {
        return b === 0 ? a : gcd(b, a % b);
    }
    
    answer[0] = gcd(n, m);
    
    // 최소공배수 계산
    answer[1] = (n * m) / answer[0];
    
    return answer;
}
    // 유클리드 알고리즘
    