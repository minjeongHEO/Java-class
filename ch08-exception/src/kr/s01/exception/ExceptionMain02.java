package kr.s01.exception;

public class ExceptionMain02 {
	public static void main(String[] args) {
		//����ó��
		//���ܰ� �߻��ص� ���� ���ᵵ�� �� �ֵ��� ���α׷������� ó���ϴ� ���� ����
		int[]array = {10,20,30};
		
		//���������� ���ܹ߻�
		for(int i=0; i<=array.length;i++) {
			//����ó��
			try {
				//���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 ����Ѵ�
				System.out.println("array["+i+"]:" + array[i]);
				
			//catch(���ܹ߻��� �����Ǵ� ���� ��ü�� Ÿ��)
				//�����ε��� ȣ�� = ArrayIndexOutOfBoundsException
			}catch(ArrayIndexOutOfBoundsException e) {
				//���ܰ� �߻��ϸ� catch������ �̵��ؼ� ���ܰ� �߻��� ������(e�� �޾�����) ����ϰų�
				//��ü�ڵ带 �ۼ��Ѵ�.
				//java������ ��ü�ڵ庸�� ������ ������ ��� / web������ ���� �ٸ��ٴ°� �˾Ƶα⸸.
				System.out.println("���� �ε����� ȣ���Ͽ����ϴ�");
			}
		}//end of for
		
		System.out.println("���α׷� ��!");//����ó���� �߱⶧���� ����� �ǰ� �������ᰡ �ȴ�.
		
	}
}
