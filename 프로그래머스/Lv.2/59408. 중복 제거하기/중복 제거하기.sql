-- 코드를 입력하세요
SELECT COUNT(DISTINCT NAME) AS count FROM ANIMAL_INS
WHERE NAME IS NOT NULL

/*
DISTINCT 중복된 항목 제거
IS NOT NULL-> 이름이 NULL이 아는부분만 집계하여 조건에 맡는 부분은 집계하지 않음
*/