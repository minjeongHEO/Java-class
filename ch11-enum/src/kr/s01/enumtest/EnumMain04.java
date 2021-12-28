package kr.s01.enumtest;

enum Item2{
	ADD(5),DEL(11),SEARCH(2),CANCLE(22); //각각생성되기 떄문에 각 생성자를 가지고있따

	//위에 지정한 상수 값들을 저장하기 위한 공간
	private final int var;//메소드를 지정해야 하니까 상수여도 소문자로 해놓음
	
	//생성자
	Item2(int v){
		var = v;
	}
	
	public int getVar() {
		return var; //메소드를 지정해야 하니까 상수여도 소문자로 해놓음
	}
}
public class EnumMain04 {
	public static void main(String[] args) {
		System.out.println(Item2.ADD);//개별적으로 호출
		System.out.println(Item2.DEL);//개별적으로 
		System.out.println(Item2.SEARCH);//개별적으로 
		System.out.println(Item2.CANCLE);//개별적으로 
		System.out.println("-----------------------");
		
		for(Item2 n : Item2.values()) {
			System.out.println(n+ ":"+n.getVar());//getVar에 각각의 열거객체로 접근해서 저장된 숫자가 나오게된다
		}
		
		
		
	}
	

}
