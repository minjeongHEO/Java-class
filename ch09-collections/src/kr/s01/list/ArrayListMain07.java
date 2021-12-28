package kr.s01.list;

import java.util.ArrayList;

class CartItem{
	private String name;//��ǰ��
	private int num;//����
	private int price;//���� //����ȭ��Ű��syso������ �о�Ë� ���ٹ������ܼ� �ٸ޼ҵ带 ������ش�

	public CartItem() {} //�⺻������// �� Ŭ���������� ��������

	public CartItem(String name, int num, int price) { //������Ʈ������ �� �Ⱦ���
		this.name = name;
		this.num = num;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}


public class ArrayListMain07 {
	public static void main(String[] args) {
		ArrayList<CartItem> list = new ArrayList<CartItem>();
		//��ü ����
		list.add(new CartItem("���",10,10000));
		list.add(new CartItem("��ġ",5,20000));
		list.add(new CartItem("����",20,30000));
		//		list.add(10);�̷������� ������ ��������

		//�ݺ����� �̿��� ArrayList ��� ���
		for(int i=0;i<list.size();i++) {
			CartItem c = list.get(i);
			//			System.out.println(c);//�ּҰ� ���
			System.out.println(c.getName() + ","+c.getNum() +","+c.getPrice());//��İ������� ����� �����ϴ� 
			//������ �迭�� �Ⱦ��� ������ ArrayList�� �۾��ϴ°� �� ���ؼ�
			//�迭�� �������ϰ� �ø��������ϰ�
		}
		System.out.println("---------Ȯ��for��---------");
		for(CartItem item : list) {
			System.out.println(item.getName()+","+item.getNum()+item.getPrice());
		}

	}
}	

