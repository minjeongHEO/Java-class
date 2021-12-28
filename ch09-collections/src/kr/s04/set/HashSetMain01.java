package kr.s04.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain01 {
	public static void main(String[] args) {
		String[] array = {"Java","Oracle","JSP","Java","HTML"};

		//Set: ������ �������� �ʰ� �ߺ����� ����
		HashSet<String> hs = new HashSet<String>();
		//������ ����
		for(String n : array) {
			hs.add(n); //�ߺ� ����
		}
		System.out.println(hs);//������� ���ĵ����ʴ���

		//����� ������ �б�
		Iterator<String> ir = hs.iterator();
		while(ir.hasNext()) {//�����Ͱ� �ִ��� ������ �����ؼ� Next�� �̾Ƴ���
			System.out.println(ir.next());
		}

		System.out.println("--Ȯ�� for���� �̿��� ���--");
		//Ȯ�� for���� �̿��� ���
		for(String s : hs) {
			System.out.println(s);

		}

	}
}
