package kr.s01.list;

import java.util.ArrayList;
import java.util.Collections; //���ı��

public class ArrayListMain06 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ӷ�");
		list.add("���");
		list.add("�޵�");
		list.add("�ڵ�");
		list.add("���");
		
		//indexOf�� �̿��� �տ������� �ε��� Ž��
		int index1 = list.indexOf("���");
		System.out.println("ù��° ���: "+index1);
		//lastIndexOf�� �̿��� �ڿ������� �ε��� Ž��
		int index2 = list.lastIndexOf("���");
		System.out.println("������ ���: "+index2);
		int index3 = list.indexOf("����");
		System.out.println("���� :"+index3);//Java������ ���°� ǥ�ø� -1 ��ȯ 
		
		//����
		Collections.sort(list);//sort ������������ ����
		System.out.println(list);
		//�������� ����
		Collections.reverse(list);//reverse �������� ����
		System.out.println(list);
	}
}
