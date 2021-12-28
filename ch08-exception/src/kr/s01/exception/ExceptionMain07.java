package kr.s01.exception;

import java.util.Scanner;

//����� ���� ����Ŭ����
class NegativeNumberUseException extends Exception{//���÷� Ŭ������ �ۼ�
	//^ (�װ�Ƽ��ѹ�~)�̰� �߿��Ѱű⶧���� �ͼ��ǿ� ���� �߰������� ������ �� �ʿ����
	//���ܹ����� ������ �� �ֵ��� ���ڸ� ������ϰ� ���޹��� �����͸� Exception������
	public NegativeNumberUseException(String str) {
		super(str);
	}
}

public class ExceptionMain07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("0�̻� �Է�: ");
		try {
			int a = input.nextInt();
			if(a >= 0) {
				System.out.println("�Է��� ����: "+ a);
			}else {
				//����ڰ� ������ ���ܸ� ���������� �߻�
				throw new NegativeNumberUseException("������ ����� �� �����ϴ�.");
			}
		}catch(NegativeNumberUseException e){ //���� ����
			System.out.println(e.getMessage());
		}catch(Exception e) { //�� ���� ����
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}finally {
			if(input!=null)input.close(); //null�� �ƴϸ� Ŭ�����ϰڴ�
		}
		
		
		
		
		

	}
}
