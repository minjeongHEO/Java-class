public class CastMain02 {
	public static void main(String[] args) {
		System.out.println("=====명시적 형변환(강제 형변환)=====");
		//*큰 자료형에서 작은 자료형으로* 강등이 일어나는 형태,
		//정보의 손실이 발생할 수도 없을 수도 있음.
		
		byte b1 = 127;
		byte b2 = 127;
		//자동적으로 int로 승격된것을 byte로 명시적 형변환
//		int result1 = b1 + b2; 
		byte result1 = (byte)(b1 + b2); //(결과값)이 int인것을 byte로 바꾼다는 걸 앞에 (byte)로 명시해준다 
						//캐스트 연산자라고 한다.
		System.out.println("result1 = " + result1); //데이터의 왜곡, 정보의 손실이 발생함
		
		short s1 = 1000;
		short s2 = 2000;
//		int result2 = s1 + s2;
		short result2 = (short)(s1+s2);//결괏값에 대해서 short로 끌어내린다.
						//캐스트 연산자라고 한다.
		System.out.println("result2 = " + result2);
		
		System.out.println("==================");
		
		int in1 = 2345;
		float f1 = 25.67f;
		int result3 =  in1 + (int)f1;//f1의 자료형 float -> int로 강제 형변환
		//소수점 뒷부분의 정보손실 발생
		System.out.println("result3 = " + result3);
		
		int in2 = 1234;
		long lg1 = 1234L;
		int result4 = in2 + (int)lg1;//lg1의 자료형 long->int로 강제 형변환
		//정보의 손실은 발생하지 않음
		System.out.println("result4 = " + result4);
		
		
	}
}
