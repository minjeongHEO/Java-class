package kr.s01.list;

import java.util.ArrayList;

public class ArrayListMain02 {
	public static void main(String[] args) {
		//List�� Ư¡ : ����Ǵ� ���� ����, �ߺ������� ���
		ArrayList al = new ArrayList();
		//��ü�� ����� �� ��� Ÿ�Ե� ����ɼ� �ֵ��� ������ƮŸ������ �ٲ�� (��ĳ�����̴ϱ� �ڵ������εȴ�)
		al.add("��ȣ��");//String->Object �ε���0
		al.add("���缮");//String->Object �ε���1
		al.add("�躴��");//String->Object �ε���2
		al.add("����ȣ");//String->Object �ε���3
		
		//�ݺ����� �̿��� ArrayList�� ��� ���
		for(int i=0;i<al.size();i++) {
			//ArrayList�� ����� ��� ��ȯ
//			al.get(i);//get�޼ҵ尡 ������ƮŸ������ ��ȯ
			//�׷��� �ٿ�ĳ���� ��Ʈ������ �ٲ�����Ѵ�
			String name = (String)al.get(i);//Object->String ����� ����ȯ ���ش�.
			System.out.println(name);
		}
	}
}
