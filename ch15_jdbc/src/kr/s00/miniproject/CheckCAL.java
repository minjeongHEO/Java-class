package kr.s00.miniproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class CheckCAL {
   public static boolean checkDateYear(String year) {
      boolean flag = false;
      try {
         if(year.length()==4) {
            int y = Integer.parseInt(year);
            if(( y > 2020 && y < 2023)) {
               flag = true;
            }
         }
      }catch(NumberFormatException e) {
         System.out.println("숫자만 입력 가능합니다.");
         flag = false;
      }
      
      return flag;
   }
   public static boolean checkDateMonth(String month) {
      boolean flag = false;
      try {
         if(month.length()==2) {
            int m =  Integer.parseInt(month);
            if((m > 0 && m <= 12)) {
               flag = true;
            }
         }
      }catch(NumberFormatException e) {
         System.out.println("숫자만 입력 가능합니다.");
         flag = false;
      }
      
      return flag;
   }
   public static boolean checkDateDate(String year, String month, String date) {
      Calendar cal = Calendar.getInstance();
      cal.set(Integer.parseInt(year), Integer.parseInt(month)-1,1);
      boolean flag = false;
      try {
         if(date.length()==2) {
            int d =  Integer.parseInt(date);
            if((d > 0 && d <= cal.getActualMaximum(Calendar.DATE))) {
               flag = true;
            }
         }
      }catch(NumberFormatException e) {
         System.out.println("숫자만 입력 가능");
         flag = false;
      }
      
      return flag;
   }
   
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      try {
         System.out.print("연도:");
         String year = br.readLine();
         boolean f = checkDateYear(year);
         System.out.println("예약하실 월을 입력하세요. (mm) : " + f);
         
         System.out.print("월:");
         String month = br.readLine();
         boolean f2 = checkDateMonth(month);
         System.out.println("예약하실 날짜를 입력하세요. (dd) : " + f2);
         
         System.out.print("일:");
         String date = br.readLine();
         boolean f3 = checkDateDate(year, month, date);
         System.out.println("객실을 선택해주세요." + f3);
         
      } catch (IOException e) {
         e.printStackTrace();
      }
      
   }
}