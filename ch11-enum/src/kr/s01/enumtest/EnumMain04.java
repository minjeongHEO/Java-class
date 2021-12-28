package kr.s01.enumtest;

enum Item2{
	ADD(5),DEL(11),SEARCH(2),CANCLE(22); //���������Ǳ� ������ �� �����ڸ� �������ֵ�

	//���� ������ ��� ������ �����ϱ� ���� ����
	private final int var;//�޼ҵ带 �����ؾ� �ϴϱ� ������� �ҹ��ڷ� �س���
	
	//������
	Item2(int v){
		var = v;
	}
	
	public int getVar() {
		return var; //�޼ҵ带 �����ؾ� �ϴϱ� ������� �ҹ��ڷ� �س���
	}
}
public class EnumMain04 {
	public static void main(String[] args) {
		System.out.println(Item2.ADD);//���������� ȣ��
		System.out.println(Item2.DEL);//���������� 
		System.out.println(Item2.SEARCH);//���������� 
		System.out.println(Item2.CANCLE);//���������� 
		System.out.println("-----------------------");
		
		for(Item2 n : Item2.values()) {
			System.out.println(n+ ":"+n.getVar());//getVar�� ������ ���Ű�ü�� �����ؼ� ����� ���ڰ� �����Եȴ�
		}
		
		
		
	}
	

}
