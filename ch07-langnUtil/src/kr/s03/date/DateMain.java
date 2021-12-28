package kr.s03.date;
//java.lang�� ����
//java.util�� �⺻��Ű���� �ƴ϶� import �������
//import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

public class DateMain {
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		Date now = new Date();
		System.out.println(now);
		
		//deprecated�Ǿ� ������� ����
		System.out.println(now.toLocaleString());
		System.out.println("--------------------");
		
		DateFormat df = DateFormat.getDateInstance();
//		����Ʈ����ȿ������̶� �޼ҵ尡�ִ�
		String today = df.format(now);
		System.out.println(today);
		System.out.println("---------------------");
		
		df=DateFormat.getDateTimeInstance();
		today = df.format(now);
		System.out.println(today);
		System.out.println("----------------------");
		
//		24�� ǥ���
//		SimpleDateFormat sf = 
//				new SimpleDateFormat("yyyy�� MM�� dd�� (E) HH:mm:ss");//ǥ����� API����
		SimpleDateFormat sf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a HH:mm:ss");//ǥ����� API����
		today = sf.format(now);
		System.out.println(today);
	}
}
