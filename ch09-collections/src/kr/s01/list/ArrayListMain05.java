package kr.s01.list;

import java.util.ArrayList;

public class ArrayListMain05 {
	public static void main(String[] args) {
		ArrayList<Integer> al  = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(16);
		
		System.out.println(al);
		System.out.println("------�տ������͹ݺ�------");
		//¦�� ����
		//�տ��� �ݺ��� �� ��� Ư�� ������ �� ������ �ϸ� �ε��� ���������� �������� ���ϰ�
		//�Ѿ�� �����Ͱ� �߻��� ������
		for(int i=0; i<al.size();i++) {
			if(al.get(i)%2==0) { //¦��
				al.remove(i);
			}
		}
		System.out.println(al);
		System.out.println("------�ڿ������͹ݺ�------");//�ε����� ������ �Ű����鼭 20�� ��ģ��.
													//�׷��� �ڿ��� ���� �����ϴ°� �����ϴ�
		//¦�� ����
		for(int i=al.size()-1;i>=0;i--) {
			if(al.get(i)%2==0) {//¦��
				al.remove(i);
			}
		}
		System.out.println(al);
		
		
	}
}
