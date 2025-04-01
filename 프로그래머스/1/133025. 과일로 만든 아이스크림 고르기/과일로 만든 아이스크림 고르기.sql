-- 코드를 입력하세요
select first_half.flavor
from first_half, icecream_info
where 
first_half.total_order > 3000
and
first_half.flavor = icecream_info.flavor
and
icecream_info.ingredient_type = 'fruit_based'
order by first_half.total_order desc;