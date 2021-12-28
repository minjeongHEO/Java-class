package kr.s02.method;

public class MethodMain03 {
	//Variable Arguments
	//�ڷ����� ��ġ�� �� �����ϰ��� �ϴ� ���� ������ �ٸ��� ������ �� �ִ�(������)
	//���޵Ǵ� �����ʹ� ���������� �迭�� �ν�
	public void argTest(int ... n){//�ڷ����� �ٲ� �� ����
		for(int i=0;i<n.length;i++) {
			System.out.println("n["+i+"]:"+n[i]);
		}
		System.out.println("---------------");
		
	}
	
	public static void main(String[] args) {
		//��ü ���� �� ����
		MethodMain03 me = new MethodMain03();
		
		me.argTest();//�ƹ��͵� �ȳ��� ��쿡�� �����Ͽ��� �ȳ���. �����͸� �ѱ��� �ʾƵ� �迭�� �����ȴ�.
					//�׷��� ���� ���� �� �迭 =length�� 0
		me.argTest(10);//n�� 10�̵��°Ծƴϰ�n�� �迭������� �׾ȿ�10�� ���Ÿ� ����Ų��.
		me.argTest(20,30);//������ �þ���ϴ��� �迭�� ó���ȴ� 
		me.argTest(40,50,60);//������ �þ���ϴ��� �迭�� ó���ȴ� 
	}
}
