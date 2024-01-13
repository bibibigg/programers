-- 코드를 입력하세요
SELECT COUNT(*) AS USERS /* 조건에 맡으면 users라는 이름으로 카운트 */
FROM USER_INFO
WHERE JOINED >= '2021-01-01' AND JOINED <= '2021-12-31'
      AND AGE >= 20 AND AGE <= 29;