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
         System.out.println("���ڸ� �Է� �����մϴ�.");
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
         System.out.println("���ڸ� �Է� �����մϴ�.");
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
         System.out.println("���ڸ� �Է� ����");
         flag = false;
      }
      
      return flag;
   }
   
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      try {
         System.out.print("����:");
         String year = br.readLine();
         boolean f = checkDateYear(year);
         System.out.println("�����Ͻ� ���� �Է��ϼ���. (mm) : " + f);
         
         System.out.print("��:");
         String month = br.readLine();
         boolean f2 = checkDateMonth(month);
         System.out.println("�����Ͻ� ��¥�� �Է��ϼ���. (dd) : " + f2);
         
         System.out.print("��:");
         String date = br.readLine();
         boolean f3 = checkDateDate(year, month, date);
         System.out.println("������ �������ּ���." + f3);
         
      } catch (IOException e) {
         e.printStackTrace();
      }
      
   }
}