-- 코드를 작성해주세요
select count(ifnull(length, 10)) as 'FISH_COUNT'
from fish_info
where year(time) = '2021';