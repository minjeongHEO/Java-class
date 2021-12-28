 public class PrintMain07 {
	public static void main(String[] args) {
		
//		예금자, 송금되기전 잔금, 송금된 금액, 송금이후 잔금, 내일 입금될 이자 출력
		
		String a = "유재석";
		int b = 1000;
		int c = 325;
		int d = 1325;
		double e = 397.5;
		
		System.out.printf("예금자: %s\n",a);
		System.out.printf("송금되기 전 잔금: %,d원\n",b);
		System.out.printf("송금된 금액: %,d원\n",c);
		System.out.printf("송금 이후 잔금: %,d원\n",d);
		System.out.printf("내일 입금 될 이자: %.1f원",e);
		
/* %s %f 헷갈렸고 소수점찍는%,d 와 %.1f참고했으며 줄바꿈 안하는 실수*/
		
	}

}
