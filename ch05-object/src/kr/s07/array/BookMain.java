package kr.s07.array;

public class BookMain {
	public static void main(String[] args) {
		//배열 선언 및 생성
		Book[] bookArray = new Book[3]; //null로 초기화, null:객체가 생성안대서 주소가 없다는의미
		int total = 0;
		
		//Book객체를 3개 생성해서 배열에 저장
		bookArray[0] = new Book("IT","Java",5000,0.05);//생성을하고 주소를 대입힌다.		
		bookArray[1] = new Book("미술","고흐",4000,0.03);//배열안에는 주소만 보관
		bookArray[2] = new Book("음악","아리랑",6000,0.06);
		
		//배열의 요소 출력
		System.out.println(bookArray[0]);// 이주소를 통해서 객체를 참조하겠다
		System.out.println(bookArray[1]);
		System.out.println(bookArray[2]);
		System.out.println("-------------------------------");
		
		//반복문을 이용해서 배열에 접근해서 객체를 호출하고 객체의 멤버변수에 저장된 데이터 출력
		for(int i=0;i<bookArray.length;i++) {
			System.out.print(bookArray[i].getCategory()+"\t");
			System.out.print(bookArray[i].getName()+"\t");
			System.out.printf("%,d원\t",bookArray[i].getPrice());
			System.out.printf("%.2f%% \n",bookArray[i].getDiscount());
			//합계
			total += bookArray[i].getPrice();
		}
		//합계 출력
		System.out.printf("책 가격의 합 : %,d원\n",total);
		
		System.out.println("=================================");
		//확장 for문을 이용해서 데이터 출력
		for(Book book : bookArray) {//참조변수앞에는 항상 자료형을 써준다> 참조자료형을쓴다(클래스명ㅇ르 따라썼음)
			//						bookArray는 객체의 주소를 전부 받는다
			System.out.printf("%s\t",book.getCategory());
			System.out.printf("%s\t",book.getName());
			System.out.printf("%,d원\t",book.getPrice());
			System.out.printf("%.2f%%\n",book.getDiscount());
		}
		System.out.println("=================================");
		
	}
	
}
