package kr.s02.mathtest;

import java.util.Random;

public class RandomMain {
	public static void main(String[] args) {
		String[] gift = {"스마트폰", "TV", "냉장고", "꽝!"};
		
		//난수 구하기
		double ran = Math.random(); //매쓰는 기본함수라서 객체생성안해도됨
		System.out.println("발생한 난수: "+ ran);//0.0~0.9999999
		System.out.println("발생한 난수: "+ ran*4);//0.0~3.9999999
//		int로 형변환 0~3
		int index = (int)(ran*4);
		System.out.println("정수형태의 난수: "+ index);
		System.out.println("오늘의 선물: "+ gift[index]);
		
		System.out.println("----------------");
		
		String[] luck = {"귀인을 만남","로또당첨","피곤해~","달콤한 프로포즈"};
						//0			1			2			3
		
//		java.util.Random r1 = new java.util.Random(); //import java.util.Random;명시 안할 시에는
		Random r1 = new Random(); //랜덤함순느 객체생성을 해줘야한다.
		index = r1.nextInt(4);//0부터 인자에 전달된 값의 전까지의 범위로 난수발생
								//0~3
		System.out.println("발생한 난수: "+index);
		System.out.println("오늘의 운세: "+luck[index]);
	}
}
