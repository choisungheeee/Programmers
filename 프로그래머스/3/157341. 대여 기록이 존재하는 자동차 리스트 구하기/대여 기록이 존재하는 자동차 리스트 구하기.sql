-- 코드를 입력하세요
SELECT distinct(a.car_id) as car_id
from car_rental_company_car a join car_rental_company_rental_history b on a.car_id = b.car_id
where a.car_type = '세단' and month(b.start_date) = "10"
order by car_id desc;