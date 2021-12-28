/*멤버*/
CREATE OR REPLACE TABLE member3(
 m_num number primary key,
 m_id varchar2(10) unique not null,
 m_passwd varchar2(10) not null,
 m_name varchar2(30) not null,
 m_phone varchar2(13) not null,
 m_regdate date default SYSDATE not null
);
CREATE SEQUENCE member3_seq;

/*객실*/
CREATE OR REPLACE TABLE room3(
 ro_num number primary key, /*객실번호*/
 ro_name varchar2(90) not null, /*객실명*/
 ro_amount number not null /*객실예약금액*/
);
CREATE SEQUENCE room3_seq;

/*예약*/
CREATE OR REPLACE TABLE reserv3(
 re_num number primary key, /*객실예약번호*/
 re_status number(1) not null, /*0.예약가능, 1.예약불가*/
 ro_num number not null references room3 (ro_num),/*객실번호*/
 m_num number not null references member3 (m_num),/*회원번호*/
 re_checkin varchar2(10) not null,
 re_checkout varchar2(10) not null
 );
 CREATE SEQUENCE reserv3_seq;