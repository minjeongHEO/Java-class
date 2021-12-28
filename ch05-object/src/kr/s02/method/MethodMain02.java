package kr.s02.method;

public class MethodMain02 {
	//���� ���� ���: ���� ȣ��(Call by reference)
	//�޼��� ȣ�� �� ���ڿ� �����ڷ���(��ü) �����͸� ����->�ּ�(reference)�� �����Ͽ� ����
	
	public void increase (int[] n) { //int[]�� �迭(��ü)/ n�� �����̸鼭 �迭��
		for(int i=0;i<n.length;i++) {
			n[i]++;//�迭�� ��Ҹ� 1 ������Ŵ
		}
	}
	
	public static void main(String[] args) {
		//�迭�� ���� �� ����, �ʱ�ȭ
		int[] ref1 = {100,200,300};
		System.out.println("===�޼��� ȣ�� ��");
		for(int i=0;i<ref1.length;i++) {
			System.out.println("ref1["+i+"]:"+ref1[i]);
		}
		System.out.println("===�޼��� ȣ�� ��");
		MethodMain02 me = new MethodMain02();
		me.increase(ref1);
		
		for(int i=0;i<ref1.length;i++) {
			System.out.println("ref1["+i+"]:"+ref1[i]);
		}
	}
}
