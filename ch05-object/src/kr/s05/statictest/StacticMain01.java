package kr.s05.statictest;

public class StacticMain01 {
	public static void main(String[] args) {
		StaticCount sc1 = new StaticCount();
		System.out.println("c : "+ sc1.c + ", count : "+ 
     	    	                                        StaticCount.count);// static�� �տ� Ŭ�������� �ٿ��� ȣ�� 
		
		StaticCount sc2 = new StaticCount();
		System.out.println("c : " + sc2.c + ", count : "+ 
    	                                          		StaticCount.count);// static�� �տ� Ŭ�������� �ٿ��� ȣ�� );
		
		StaticCount sc3 = new StaticCount();
		System.out.println("c : " + sc3.c + ", count : "+ 
	    												StaticCount.count);// static�� �տ� Ŭ�������� �ٿ��� ȣ�� );//�������� staticǥ����� �ƴ�
//														sc1.count);//������ �ǳ�, �������� staticǥ����� �ƴ�
	
		/*
		 * static�� ������ ����
		 * static������ ��ü �������� ���� / �����ڳ� main���� ȣ��� ���� �޸𸮿� �ö󰣴�
		 */
	}
}


