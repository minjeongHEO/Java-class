package kr.s00.miniproject;

public class Reserv3VO {
	   private int re_num;
	   private int re_status; //예약가능여부(0:예약가능, 1:이용중)
	   private int ro_num;
	   private int m_num;
	   private String re_checkin;
	   private String re_checkout;
	   
	   public int getRe_num() {
	      return re_num;
	   }
	   public void setRe_num(int re_num) {
	      this.re_num = re_num;
	   }
	   public int getRe_status() {
	      return re_status;
	   }
	   public void setRe_status(int re_status) {
	      this.re_status = re_status;
	   }
	   public int getRo_num() {
	      return ro_num;
	   }
	   public void setRo_num(int ro_num) {
	      this.ro_num = ro_num;
	   }
	   public int getM_num() {
	      return m_num;
	   }
	   public void setM_num(int m_num) {
	      this.m_num = m_num;
	   }
	   public String getRe_checkin() {
	      return re_checkin;
	   }
	   public void setRe_checkin(String re_checkin) {
	      this.re_checkin = re_checkin;
	   }
	   public String getRe_checkout() {
	      return re_checkout;
	   }
	   public void setRe_checkout(String re_checkout) {
	      this.re_checkout = re_checkout;
	   }
	}