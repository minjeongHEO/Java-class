package kr.s05.statictest;

public class StacticMain01 {
	public static void main(String[] args) {
		StaticCount sc1 = new StaticCount();
		System.out.println("c : "+ sc1.c + ", count : "+ 
     	    	                                        StaticCount.count);// static은 앞에 클래스명을 붙여서 호출 
		
		StaticCount sc2 = new StaticCount();
		System.out.println("c : " + sc2.c + ", count : "+ 
    	                                          		StaticCount.count);// static은 앞에 클래스명을 붙여서 호출 );
		
		StaticCount sc3 = new StaticCount();
		System.out.println("c : " + sc3.c + ", count : "+ 
	    												StaticCount.count);// static은 앞에 클래스명을 붙여서 호출 );//정상적인 static표기법이 아님
//														sc1.count);//실행은 되나, 정상적인 static표기법이 아님
	
		/*
		 * static은 공유의 공간
		 * static변수는 객체 생성과는 무관 / 생성자나 main에서 호출로 인해 메모리에 올라간다
		 */
	}
}


