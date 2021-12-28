package kr.s05.map;

import java.util.HashMap;

public class HashMapMain01 {
	public static void main(String[] args) {
		/*
		 * Map: key�� value�� ������ ����
		 * 		key�� ������ �������� ����
		 */
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("���", 95);
		map.put("����Ź", 100);
		map.put("���»���", 85);
		map.put("���", 93);
		map.put("����ȭ", 70);
		//key�� �ߺ��� ����. key�� �ߺ��Ǹ� �������� �Է��� ���� ���
		map.put("����Ź", 0);
		//value�� null ���� //Ű�� ����� null�ǵ����̸� �ȵ��� �Ѵ�
		map.put("����", null);
		//key�� null ����
		map.put(null, 100);
		
		System.out.println(map);
		
		int num = map.get("����Ź");//��Ƽ���� ��Ʈ�� �ڵ���ȯ
		System.out.println("����Ź�� ������ "+num);
		Integer num2 = map.get("����");//null�� int�ϋ� ����
		System.out.println("������ ������ "+num2);
		
	}
}
