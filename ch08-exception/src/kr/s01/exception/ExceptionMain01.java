package kr.s01.exception;

public class ExceptionMain01 {
	public static void main(String[] args) {
		int[] array = {10,20,30};
		//���������� ���ܸ� �߻�
		//���� �ε���3�� �Ϻη� ȣ���ؼ�(length�̸����� ���Ϸ� ����) ���ܸ� �߻����Ѻ���
		for(int i=0;i<=array.length;i++) {
			System.out.println("array["+i+"]:"+array[i]);
		}//���ܹ߻��� �Ʒ����� ����ȵ�
		System.out.println("���α׷� ��");
	}
}
