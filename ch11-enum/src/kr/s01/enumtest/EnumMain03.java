package kr.s01.enumtest;

enum Item{
	ADD,DEL,SEARCH,CANCLE
}

public class EnumMain03 {
	public static void main(String[] args) {
		//values()�޼���� ����Ÿ���� ��� ���� ��ü���� �迭�� ����� ��ȯ���ش�.
		Item[] items = Item.values();
		System.out.println("items.length: "+items.length);
		
		//Ȯ�� FOR���� �̿��� ���
		for(Item n : items) {
			System.out.println(n.ordinal());
		}
	}
}
