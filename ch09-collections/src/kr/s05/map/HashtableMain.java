package kr.s05.map;

import java.util.Hashtable;
import java.util.Enumeration; //�ؽ����̺�

public class HashtableMain {
	public static void main(String[] args) {
		Hashtable<String, String> h = new Hashtable<String,String>();
		h.put("name","ȫ�浿");
		h.put("age", "20");
		h.put("tel", "010-1234-5678");
		h.put("job", "Ž��");
		h.put("address", "�����");
		//key�� �ߺ��� �������� ����. key�� �ߺ��ϸ� �������� �Է��� �� ���
		h.put("name","�念��");
		//value�� null�� ������������ �����Ͻÿ� ���������� ����� �����߻�
//		h.put("zipcode",null);
		//key�� null�� �������� ���� ����� �����߻�
//		h.put(null, "������");
		
		System.out.println(h);
		System.out.println("------------------------------");
		
		String name = h.get("name");
		System.out.println("name="+name);//������ �ߺ��Ǽ� �̸��� �ٲ���

		//Hashtable�� ����� key���ϱ�
		Enumeration<String> en = h.keys();
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println(key+","+h.get(key));
		}
		
	}
}
