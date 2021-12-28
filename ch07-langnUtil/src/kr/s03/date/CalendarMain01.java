package kr.s03.date;

import java.util.Calendar;

public class CalendarMain01 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		int year = today.get(Calendar.YEAR);//����ƽ�� ������ �� �˼��ֵ�
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE);//��
		
		System.out.println(year+"��"+month+"��"+date+"��");
		
		int day = today.get(Calendar.DAY_OF_WEEK);//���� 1(��)~7(��)
		
		String nday = "";
		switch(day){
		case 1: nday="��";break;
		case 2: nday="��";break;
		case 3: nday="ȭ";break;
		case 4: nday="��";break;
		case 5: nday="��";break;
		case 6: nday="��";break;
		case 7: nday="��";break;
		}
		System.out.println(nday+"����");
		
		int ampm = today.get(Calendar.AM_PM);//����0, ����1
		String str = ampm==Calendar.AM ? "����" : "����";
		System.out.println(str);
		
		int hour = today.get(Calendar.HOUR);//��, HOUR_Of_DAY: 24��ǥ���
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		System.out.println(hour+":"+min+":"+sec);//�빮�ھƴ� 
		
	}
}
