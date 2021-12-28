package kr.s01.exception;

public class ExceptionMain03 {
	public static void main(String[] args) { //��ĳ�ʸ� ��������ʰ� args�� ������ �����ϸ�
		
		int var = 50;
		
		//���ܰ� �߻��ϸ�
		//���ܰ�ü�� �����ǰ� ���ܰ�ü�� ���޵� catch������ �̵��ؼ� ���๮�� �����ϴ±���
		try {
						//Integer.parseInt: String -> int
			int data = Integer.parseInt(args[0]);
			
			System.out.println(var/data);
			System.out.println("-----------");
//		}catch(Exception e) {
//			System.out.println("������ ���ܴ� ����� ������~");//��ĳ������ �ڵ�������ȯ�Ǵϱ� �Ʒ����ִ� �ֵ��� �߻��ص� ����� ������ ������ �����
		}catch(NumberFormatException e) {//(���ڵ����ϵ� Ÿ�Ը� ��Ʈ���ΰ�� ex)����,50!)
			System.out.println("���ڰ� �ƴմϴ�.");
		}catch(ArrayIndexOutOfBoundsException e){ //����ĳġ (�����Ͱ����°��)
			System.out.println("�Է��� �����Ͱ� �����ϴ�.");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� ���� �����ϴ�.");
		}catch(Exception e) {
			System.out.println("������ ���ܴ� ����� ������~");//�׷����������� �־��ش�
		}
		System.out.println("���α׷� ��!!");
		/*
		 * ����catch�� ��� ���ǻ���
		 * Exception�� ���� ���� Ŭ������ ���ÿ� ����Ҷ��� 
		 * ���� ����Ŭ������ ���� ����ϰ� ���� �ڿ� Exception�� ����ؾ� ���ۻ� ������ �߻������ʴ´�
		 * (�ڵ�������ȯ������)
		 */
	}
}
