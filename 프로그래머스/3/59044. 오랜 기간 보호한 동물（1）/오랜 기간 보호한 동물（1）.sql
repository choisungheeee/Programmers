-- 코드를 입력하세요
SELECT l.name, l.datetime
from animal_ins l left join animal_outs r on l.animal_id = r.animal_id
where r.animal_id is null
order by l.datetime 
limit 3;