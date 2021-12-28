create table test2(
num number primary key, --number:최대치까지 가능
title varchar2(30) not null,--오라클은 한글 3바이트씩
name varchar2(30) not null,
memo varchar2(4000) not null,
email varchar2(30), --null을 인정한다.
reg_date date not null
);
create sequence test2_seq; --1부터 1씩 증가
