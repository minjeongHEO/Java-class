package kr.s05.map;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapMain02 {
	public static void main(String[] args) {
		String[] msg = {"Berlin","Paris","Seoul","New York","London"};
				//key,  value
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		//�ݺ����� �̿��� �������� ����
		for(int i=0;i<msg.length;i++) {
			map.put(i,msg[i]);//(�ε���,���)
		}
		System.out.println(map);
		System.out.println("-----------------");
		//HashMap�� ����� key���ϱ�
		
//		Set<Integer> s = map.keySet();//�ؽü��̶��� ���� ������ �ʴ��� set�̶��� �������̽��� Ű�� �޼ҵ峻���� Ŭ������ ����� Ŭ�����ȿ� ���ø���Ʈ ��Ű�� Ÿ���� ��Ÿ�� �� �ڷᱸ���� Ư���� ���´�
//		Iterator<Integer> keys = s.iterator();
		//������ �ѹ��� ȣ���ϸ� ������ �Ⱦ��°� ���� �׷���
		Iterator<Integer> keys = map.keySet().iterator();
		
		while(keys.hasNext()) {
			Integer key = keys.next();//�ڵ����� ��ȯ�Ǵ°���� ������ int�� �ᵵ ��� ������
			System.out.println(key+", "+map.get(key));
		}
	}
}
