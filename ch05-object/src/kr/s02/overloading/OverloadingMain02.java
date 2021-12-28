package kr.s02.overloading;

public class OverloadingMain02 {
	//전달되는 인자의 타입을 모두 String으로 변환해서 문자열의 길이을 구하는 메서드만들기
	public void getLength(int n) {
		String s= String.valueOf(n); //★ valueOf를 통한 int -> String변환
//		System.out.println(s+"의 길이: "+s.length());
		getLength(s);//★재활용성을 늘린다.
	}
	void getLength(float n){//접근제한자는 달라도 상관없음
		String s = String.valueOf(n);//valueOf를 통한 float -> String변환
//		System.out.println(s+"의 길이: "+s.length());		
		getLength(s);
	}
	
	private void getLength(String s) {
		System.out.println(s+"의 길이: "+s.length());
	}
	
	public static void main(String[] args) {
		OverloadingMain02 om = new OverloadingMain02();
		om.getLength(1000);
		om.getLength(3.14f);
		om.getLength("Hello");
		
	}
}
