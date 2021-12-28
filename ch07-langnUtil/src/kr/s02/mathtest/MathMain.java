package kr.s02.mathtest;

public class MathMain {
	public static void main(String[] args) {
		int a = Math.abs(-10);
		System.out.println("절대값: "+ a);
		
		double b= Math.ceil(3.3);//★많이씀
		System.out.println("올림: "+ b);
		
		double c= Math.floor(3.3);//★많이씀
		System.out.println("버림: "+ c);
		
		int d = Math.round(3.7f);//★많이씀 
								//반환값을 int로 지정했으므로 인자를float으로 넣어야함
								//인자값이 double이면 반환값long
		System.out.println("반올림: "+ d);
		
		int e = Math.max(3, 5);
		System.out.println("최대값: "+ e);
		
		int f = Math.min(4, 7);
		System.out.println("최소값: "+ f);
		
	}
}
