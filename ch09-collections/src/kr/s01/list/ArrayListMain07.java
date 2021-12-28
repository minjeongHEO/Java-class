package kr.s01.list;

import java.util.ArrayList;

class CartItem{
	private String name;//상품명
	private int num;//수량
	private int price;//가격 //은닉화시키면syso데이터 읽어올떄 접근문제생겨서 겟메소드를 만들어준다

	public CartItem() {} //기본생성자// 이 클래스에서는 사용안했음

	public CartItem(String name, int num, int price) { //웹사이트에서는 잘 안쓴다
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
		//객체 저장
		list.add(new CartItem("라면",10,10000));
		list.add(new CartItem("김치",5,20000));
		list.add(new CartItem("만두",20,30000));
		//		list.add(10);이런식으로 넣으면 에러난다

		//반복문을 이용한 ArrayList 요소 출력
		for(int i=0;i<list.size();i++) {
			CartItem c = list.get(i);
			//			System.out.println(c);//주소값 출력
			System.out.println(c.getName() + ","+c.getNum() +","+c.getPrice());//행렬개념으로 출력이 가능하다 
			//이차원 배열을 안쓰는 이유가 ArrayList로 작업하는게 더 편해서
			//배열은 삭제못하고 늘리지도못하고
		}
		System.out.println("---------확장for문---------");
		for(CartItem item : list) {
			System.out.println(item.getName()+","+item.getNum()+item.getPrice());
		}

	}
}	

