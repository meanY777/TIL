create table member_table(
	member_id		varchar2(30)		primary key
	,member_pw 		varchar2(30)		not null
	,member_nm		varchar2(30)		not null
	,member_indate	date				default sysdate


);

<-- 테이블 정보 조회하는 쿼리 -->
select
	member_id
	,member_pw
	,member_nm
	,to_char(member_indate,'YYYY-MM-DD') as member_indate
from
	member_table
order by
	member_nm ;


<--	테이블 정보 삭제하는 쿼리 -->	
delete from
	member_table
where
	member_id='test1';
	
delete from
	member_table
where
	member_id=#{member_id};
	
	