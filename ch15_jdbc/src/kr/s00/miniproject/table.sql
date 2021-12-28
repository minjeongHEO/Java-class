/*���*/
CREATE OR REPLACE TABLE member3(
 m_num number primary key,
 m_id varchar2(10) unique not null,
 m_passwd varchar2(10) not null,
 m_name varchar2(30) not null,
 m_phone varchar2(13) not null,
 m_regdate date default SYSDATE not null
);
CREATE SEQUENCE member3_seq;

/*����*/
CREATE OR REPLACE TABLE room3(
 ro_num number primary key, /*���ǹ�ȣ*/
 ro_name varchar2(90) not null, /*���Ǹ�*/
 ro_amount number not null /*���ǿ���ݾ�*/
);
CREATE SEQUENCE room3_seq;

/*����*/
CREATE OR REPLACE TABLE reserv3(
 re_num number primary key, /*���ǿ����ȣ*/
 re_status number(1) not null, /*0.���డ��, 1.����Ұ�*/
 ro_num number not null references room3 (ro_num),/*���ǹ�ȣ*/
 m_num number not null references member3 (m_num),/*ȸ����ȣ*/
 re_checkin varchar2(10) not null,
 re_checkout varchar2(10) not null
 );
 CREATE SEQUENCE reserv3_seq;