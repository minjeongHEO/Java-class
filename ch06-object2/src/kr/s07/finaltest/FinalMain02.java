package kr.s07.finaltest;

class FinalMe{
	int var = 100;
	
	//1. �޼��忡 final�� �����ϸ� �ڽ�Ŭ�������� �޼��� �������̵��� �� ������.
	public final void setVar(int var) {
		this.var = var;
	}
}
public class FinalMain02 extends FinalMe{
	
//����� ������ �������̵������� Ȯ���� �ȉ´�
//	@Override
//	public void setVar(int var) {
//		System.out.println(var);
//	}

	
	public static void main(String[] args) {
		FinalMe fm = new FinalMe();
		fm.setVar(300);
		System.out.println(fm.var);
	}
}
