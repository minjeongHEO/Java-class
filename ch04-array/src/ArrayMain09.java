public class ArrayMain09 {
	public static void main(String[] args) {
		int[] test = {10,20,30,40,50};//�Ͻ��� �迭 ����
		//		int[] test = new int[] {10,20,30,40,50};//����� �迭 ����

		System.out.println("======2���ǽ�======");
		for(int i=0;i<test.length;i++) {
			System.out.println(test[i]);
		}
		System.out.println("======3���ǽ�======");
		for(int a : test) {
			System.out.print(a+"\t");
		}
		System.out.println("======4���ǽ�======");
		//		�ε��� 3�� �����͸� 100���� ����
		test[3] = 100;

		System.out.println("======5���ǽ�======");
		//		������ ����� ���� 200���� ����
		test[test.length-1] = 200;

		System.out.println("======7���ǽ�======");
		//		Ȧ�� �ε����� 10, ¦�� �ε����� 20
		for(int i=0;i<test.length;i++) {
			if(i%2==0) {//¦��
				test[i] = 20;
			}else {//Ȧ��
				test[i] = 10;
			}
			System.out.println(test[i]);
		}
//		for(int num:test) {
//			System.out.println(num+" ");
//		}
		System.out.println("======8���ǽ�======");
		//		��� ����� ���հ� ����� ���ϰ� ��� (sum. avg)
		int sum=0;
		double avg=0;
		
		for(int i=0;i<test.length;i++) {
			sum += test[i];
		}
		System.out.println("����:"+sum);
		avg=sum/(double)test.length;
		System.out.printf("���: %.2f",avg);
	}
}
