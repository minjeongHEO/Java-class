public class ArrayMain09 {
	public static void main(String[] args) {
		int[] test = {10,20,30,40,50};//암시적 배열 생성
		//		int[] test = new int[] {10,20,30,40,50};//명시적 배열 생성

		System.out.println("======2번실습======");
		for(int i=0;i<test.length;i++) {
			System.out.println(test[i]);
		}
		System.out.println("======3번실습======");
		for(int a : test) {
			System.out.print(a+"\t");
		}
		System.out.println("======4번실습======");
		//		인덱스 3의 데이터를 100으로 변경
		test[3] = 100;

		System.out.println("======5번실습======");
		//		마지막 요소의 값을 200으로 변경
		test[test.length-1] = 200;

		System.out.println("======7번실습======");
		//		홀수 인덱스에 10, 짝수 인덱스에 20
		for(int i=0;i<test.length;i++) {
			if(i%2==0) {//짝수
				test[i] = 20;
			}else {//홀수
				test[i] = 10;
			}
			System.out.println(test[i]);
		}
//		for(int num:test) {
//			System.out.println(num+" ");
//		}
		System.out.println("======8번실습======");
		//		모든 요소의 총합과 평균을 구하고 출력 (sum. avg)
		int sum=0;
		double avg=0;
		
		for(int i=0;i<test.length;i++) {
			sum += test[i];
		}
		System.out.println("총합:"+sum);
		avg=sum/(double)test.length;
		System.out.printf("평균: %.2f",avg);
	}
}
