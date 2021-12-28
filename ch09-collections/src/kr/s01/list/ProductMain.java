package kr.s01.list;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProductMain {
	ArrayList<Product> list;
	BufferedReader br;
	
	//생성자
	public ProductMain() {
//		ArrayList<Product> list = new ArrayList<Product>(); //이렇게해도됨 멤버변수로 정의하기위해 위에적었음
		list = new ArrayList<Product>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));//br은 생성자에서도 사용하고 input()에서도 사용하니까 멤버변수로 정의해야한다
			//메뉴 호출
			callMenu();
		}catch(IOException e) {
			//콘솔에 붉은색으로 예외문구 표시
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();} catch(IOException e) {}//자원정리할때는 한라인으로 명시
		}
	}
	//메뉴호출
	public void callMenu() throws IOException{
		while(true) {
			//숫자가아닌거입력하면 와일문에 머물게
			try {
				System.out.print("1.상품 입력, 2.상품 목록 보기, 3.종료 > ");
				int num = Integer.parseInt(br.readLine());//한라인의 데이터입력후 엔터치면 에터는사라지고 그데이터가
				if(num == 1) {
					input();
				}else if(num == 2) {
					output();
				}else if(num == 3) {
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 허용!");
			}
		}
	}
	
	//상품입력메소드를 만든다 콜메뉴가 너무 비대해질수있으니까 가독성을 위해 따로 만ㄴ든다
	public void input()throws IOException{
		Product p = new Product();
		//set메소드를 이용해서 데이터를 넣어준다
		System.out.print("상품명:");
		p.setName(br.readLine());
		
		System.out.print("상품번호:");
		p.setNum(br.readLine());
		
		System.out.print("가격:");
		p.setPrice(Integer.parseInt(br.readLine()));
		
		System.out.print("제조사:");
		p.setMaker(br.readLine());
		
		System.out.print("재고:");
		p.setStock(Integer.parseInt(br.readLine()));
		
		//Product를  ArrayList에 저장
		list.add(p);
		
	}
	//상품목록보기
	public void output(){
		System.out.println("상품명\t상품번호\t가격\t제조사\t재고");
		System.out.println("---------------------------");
		//확장for문
		for(Product p:list) {
			System.out.printf("%s\t",p.getName());
			System.out.printf("%s\t",p.getNum());
			System.out.printf("%,d원\t",p.getPrice());
			System.out.printf("%s\t",p.getMaker());
			System.out.printf("%s\n",p.getStock());
		}
	}
	
	public static void main(String[] args) {
		//main에서는 객체만 생성하기에 간단하다
//		Product p = new Product();
		new ProductMain(); //작업은 callMenu에서 거의 다하기때문에 
	}
}
