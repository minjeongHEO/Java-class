package kr.s06.animal;

public class Animal {
	//멤버변수 은닉화
		private String name;//이름
		private int age;//나이
		private boolean fly;//비행 여부 //string으로 설정했을시 true만 뽑을때 불편하고 다른단어로 입력시 (가능불가능/비행비행불가)에러날수있다.
		
		public Animal() { //디폴트 생성자를 만들어야 main자바에 6라인 에러안난다,
//			아래에 파라미터있는 생성자가 있끼떄문에 자동으로 안만들어주기떄ㄴ문이다
			
		}
		public Animal(String name, int age, boolean fly) {
			//멤버변수   = 지역변수
			 this.name = name;
			 this.age = age;
			 this.fly = fly;
		}
		
		
		
		//직접 호출을 못하는상황에서 메소드를 이용해서 호출한다.
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public boolean isFly() {
			return fly;
		}
		public void setFly(boolean fly) {
			this.fly = fly;
		}
		
}
