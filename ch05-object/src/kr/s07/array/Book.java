package kr.s07.array;

public class Book {
	//멤버 변수
	private String category;//카테고리
	private String name;//책의이름
	private int price;//가격
	private double discount;//할인율
	
	public Book() {}
		
	public Book(String category, String name, int price, double discount) {
		//멤버변수      = 지역변수
		this.category=category;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}//기본을쓰는거보다 이렇게 파라미터넣은형태로 쓰는게 코드가 줄어든다
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	
}
