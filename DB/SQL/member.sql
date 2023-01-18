with ticketing_count(ss_mo_num, movie_ticketing_count)
as
(SELECT ss_mo_num, COUNT(*) FROM TICKETING
	JOIN SCREEN_SCHEDULE ON TI_SS_NUM = SS_NUM
   WHERE TI_ME_ID LIKE 'abc'
   GROUP BY SS_MO_NUM) -- 영화별 예매 횟수, 예매한 전체 영화 수가 아님
   select @num := count(*) from ticketing_count;
   select @num;