package kr.s06.poly;

//!!!!!!!!!부모 클래스
class Product{
	int price; //제품의 가격
	int bonusPoint; //제품 구매시 제공하는 보너스 점수
	
	public Product(int price) { //생성자
		this.price = price;
		bonusPoint = price/10; //보너스 점수는 제품 가격의  10%
	}
	
	public String getName() { //메서드
		return "상품";
	}
	
}
//자식클래스
class Tv extends Product{ //디폴트생성자가 자동적으로 호출되는데 부모에 디폴드생성자가 없어서 에러남
	public Tv() { //생성자
		super(200);	//인자가 있는 수퍼를 명시해야 에러 사라진다
	}
	@Override
	public  String getName() {
		return "Tv";
	}
}
//자식클래스2
class Computer extends Product{
	public Computer() {
		super(300);
	}
	public String getName() {
		return "Computer";
	}
}
//자식클래스3
class Audio extends Product{
	public Audio() {
		super(400);
	}
	@Override
	public String getName() {
		return "Audio";
	}
}
class Buyer{ //고객 클래스
	int money = 1000; //소유금액
	int bonusPoint = 0; //★int bonusPoint;로 해도 됨 생성자가 0으로 초기화 해주기떄문에
	
	//구매하기
	/*public void buy(Tv tv) { //tv는 메소드를 만들어서 구매가 가능하지만 컴퓨터는 구매못함
		
	}
	public void buy(Computer computer) { //컴퓨터 메소드를 만들면 문제해결이지만 일일이 메소드를 다 추가해야함
		
	}*/
	public void buy(Product p) { //그래서 부모클래스 하나로만 프로그래밍한다
		/*첫번째 방법
		 * if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
		}else {
			money -= p.price;
			(return;) void형일 때 숨어있다 평상시엔 명시를 안한다.
		}*/
		/*두번째 방법*/
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
			return; //메서드를 빠져나감(메서드 종료) void형일 경우에만 쓸 수있음
		}
		money -= p.price; //리턴때문에 if else 효과를 쓸수있따
		bonusPoint += p.bonusPoint;//제품의 보너스 누적
		
		System.out.println(p.getName()+"을 구입하셨습니다");
		System.out.println("현재 남은 돈은 " + money +"만원입니다");
		System.out.println("현재 보너스 점수는 " + bonusPoint +"점 입니다");
		/*주의 사항
		 * if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
			return; //메서드를 빠져나감(메서드 종료) void형일 경우에만 쓸 수있음
		}else {
			
		}는 이중이므로 return과 else는 같이 명시하지않는다 */
	}	
	
	
}
public class PolyMain05 {
	public static void main(String[] args) {
		//고객 객체 생성
		Buyer b = new Buyer();
		//Tv 객체 생성
		Tv tv = new Tv();
		//Computer 객체 생성
		Computer com = new Computer();
		//Audio 객체 생성
		Audio au = new Audio();
		
		//구매하기
		b.buy(tv);//Tv -> Product 형변환 (자식클래스타입 -> 부모클래스타입)
				//업캐스팅
		System.out.println("---------------");
		
		b.buy(com); //Computer -> Product 형변환(자식클래스타입->부모클래스타입)
					//업캐스팅
		System.out.println("---------------");

		b.buy(au);//Audio->Product 형변환
	}
}
