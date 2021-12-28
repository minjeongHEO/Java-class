public class ForMain01 {
	public static void main(String[] args) {
		//for(초기식;조건식;증감식){
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("-----------");
		//수행문이 한 줄일 경우 {}블럭 생략(일반적으로 for문(반복문)은 생략안하고 if문(조건문)에서 많이 생략한다.)
		for(int i=1;i<=5;i++) 
			System.out.println(i);
		
		System.out.println("프로그램 끝");

	}

}
