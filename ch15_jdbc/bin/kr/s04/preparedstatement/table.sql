create table test2(
num number primary key, --number:�ִ�ġ���� ����
title varchar2(30) not null,--����Ŭ�� �ѱ� 3����Ʈ��
name varchar2(30) not null,
memo varchar2(4000) not null,
email varchar2(30), --null�� �����Ѵ�.
reg_date date not null
);
create sequence test2_seq; --1���� 1�� ����
