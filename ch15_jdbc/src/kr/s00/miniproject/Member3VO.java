package kr.s00.miniproject;

import java.sql.Date;

public class Member3VO {
	   private int m_num; //ȸ����ȣ
	   private String m_id; //ȸ�����̵�
	   private String m_passwd; //��й�ȣ
	   private String m_name; //ȸ���̸�
	   private String m_phone; //����ó
	   private Date m_regdate; //������
	   
	   public int getM_num() {
	      return m_num;
	   }
	   public void setM_num(int m_num) {
	      this.m_num = m_num;
	   }
	   public String getM_id() {
	      return m_id;
	   }
	   public void setM_id(String m_id) {
	      this.m_id = m_id;
	   }
	   public String getM_passwd() {
	      return m_passwd;
	   }
	   public void setM_passwd(String m_passwd) {
	      this.m_passwd = m_passwd;
	   }
	   public String getM_name() {
	      return m_name;
	   }
	   public void setM_name(String m_name) {
	      this.m_name = m_name;
	   }
	   public String getM_phone() {
	      return m_phone;
	   }
	   public void setM_phone(String m_phone) {
	      this.m_phone = m_phone;
	   }
	   public Date getM_regdate() {
	      return m_regdate;
	   }
	   public void setM_regdate(Date m_regdate) {
	      this.m_regdate = m_regdate;
	   }
	}