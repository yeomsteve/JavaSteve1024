-- test 계정 추가. 비번 설정 없음
create user test;

-- test1 계정 추가 비번이 1234
create user test1 identified by '1234';

-- test1 계정에게 shoppingmall2 DB에 있는 모든 테이블의 select권한부여
-- '%' : 외부에서 접근허용, 'localhost' : 내부에서 접근허용
-- @%=외부에서 접근가능하게함
grant select on shoppingmall2.* to test1@'%';
-- test1 계정에게 shoppingmall2 DB에 있는 모든 테이블의 모든 권한 부여
grant all privileges on shoppingmall2.* to test1@'%';

-- 권한 회수
revoke all on shoppingmall2.* from test1;

-- 계정 삭제
drop user test;

/*2. char(100 char) => char(100)
  4. sysdate => now()
  5. UPPER :  영문을 전부 대문자로
  7. 기본키 설정하듯이 유니크 설정하면됨
  create table 테이블명(
  속성 타입 unique);
  8. (테이블, 컬럼) => 무시하고 서술
  
-- null 체크는 is null 또는 is not null 
select * from member where me_name is not null;
  */
