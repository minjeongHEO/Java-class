package kr.s02.method;

public class MethodMain03 {
	//Variable Arguments
	//자료형이 일치할 때 전달하고자 하는 값의 갯수를 다르게 지정할 수 있다(가변적)
	//전달되는 데이터는 내부적으로 배열로 인식
	public void argTest(int ... n){//자료형은 바꿀 수 없다
		for(int i=0;i<n.length;i++) {
			System.out.println("n["+i+"]:"+n[i]);
		}
		System.out.println("---------------");
		
	}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		MethodMain03 me = new MethodMain03();
		
		me.argTest();//아무것도 안넣을 경우에도 컴파일에러 안난다. 데이터를 넘기지 않아도 배열은 생성된다.
					//그러나 방이 없는 빈 배열 =length는 0
		me.argTest(10);//n에 10이들어가는게아니가n이 배열을만들고 그안에10이 들어간거를 가르킨다.
		me.argTest(20,30);//갯수가 늘어난다하더라도 배열로 처리된다 
		me.argTest(40,50,60);//갯수가 늘어난다하더라도 배열로 처리된다 
	}
}
