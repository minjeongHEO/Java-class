package kr.s01.exception;
//throws����� ����
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;//BufferedReader�������� �ʿ��� IO=INPUTOUTPUT

public class ExceptionMain05 {
	//����޼���
	//throws������� ���
	//�޼��忡 throws����Ŭ������ ����ϸ� �޼��峻�� try~catch���� �����ϰ�
	//���ܰ� �߻��ϸ� ���ܸ� �����ϰ� �޼��带 ȣ���ϴ� ������ try~catch���� ����� �װ����� ���ܸ� �絵
	//�����ϰ� ���ϸ� ó���ϴ°Ծƴϰ� ���޿���
	public void printData()throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�� �Է�:");
		int dan = Integer.parseInt(br.readLine());//readLine():����ġ�� �Ѷ����� �����͸� ��Ʈ������ ��ȯ����
		//�׷��� Integer.parseInt:��Ʈ���� ��Ʈ�� ����
		System.out.println(dan+"��");
		System.out.println("-------------");
		for(int i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	
	public static void main(String[] args) {
		ExceptionMain05	ex = new ExceptionMain05();
		try {
			ex.printData();
		}catch(Exception e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
	}
}
