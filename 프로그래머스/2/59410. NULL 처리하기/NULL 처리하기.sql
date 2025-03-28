-- 코드를 입력하세요
SELECT animal_type, ifnull(name, 'No name') as name, sex_upon_intake
from animal_ins
order by animal_id;


/*

IFNULL(컬럼명, '치환할 문자')

IF(컬럼명 IS NULL, 'NULL이면 반환', 'NULL이 아니면 반환') 

NULLIF('전자', '후자') -> 전자와 후자가 같으면 NULL반환, 아니면 전자 반환

*/