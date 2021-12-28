package kr.s01.exception;


public class ExceptionMain06 {
	//throw ������. throw�� �̿��� ������ ���ܹ߻�
	public void methodA(String[] n)throws Exception{
		//���⼭�� Ʈ����ĳġ �����ص��ȴ�. args���� �Է¹޾Ƽ� String�� �����غ������Ѵ�
		if(n.length>0) { //�Է��� ���� �ִ� ���
			for(String s:n) {
				System.out.println(s);//�Է��� ������ ���
			}
		}else {//�Է��� ���� ���� ���
			//���������� ���ܹ߻�
//			new Exception();//���ܰ��߻��ѰԾƴ϶� �޸𸮻� ������� ���ܰ�ü�� �����Ѱ� 
//			throw new Exception(); //Ʈ����ĳġ���Ǿ��־�� ���ܸ������� �������ȳ���.��ü�� ����, throw���־�� �����ִ� ���ܰ�ü�� �����ؼ� ���������ֵ�.
			throw new Exception("�Է��� �����Ͱ� �����ϴ�!!"); //ĳġ������ �̵��ؼ� �� ������ ����ǵ����Ѵ�
		}
	}
	
	public static void main(String[] args) {
		//������ ����üũ�� �ϱ����� ���������� ���ܸ� �߻����Ѻ���.
		ExceptionMain06 ex  = new ExceptionMain06();
		//����ó��
		try {
			ex.methodA(args);//string args  �� methodA(args)�� ���´�.
		}catch(Exception e) {
			System.out.println(e.getMessage());//�����Ͱ� ���(�Է��ѵ����Ͱ������ϴ�!!)�Ǿ��־�� �ٸ޽����� �о�ü��ֵ�.
		}
		
	}
	
	/*
	 * ������ ����üũ �α���ó���� ����ġ�Ҷ� ����ϱ⵵�Ѵ�
	 * ���������������ε� ���������� ������ ������ �����̰� ȿ������ ������ �����Ѵ�.
	 */

}
