public class CastMain01 {
	public static void main(String[] args) {
		System.out.println("====������ ����ȯ(�ڵ� ����ȯ)====");
		//*���� �ڷ������� ū �ڷ�������* �°��� �Ͼ�� ����
		//������ �ս��� ���� ������ �ڵ������� �߻�
		//������ �ϱ� ���� ����ȯ�� �Ѵ�
		
		byte b1 = 127;
		byte b2 = 127;
//		byte result1 = b1 + b2; //254�� byte���� �� �� �����Ƿ� ���� (-128 ~ 127 (8bit))
		int result1 = b1 + b2; //32bit(4byte)�̸� byte�� �����͸� �����ϸ� 32bit�� �°�
		
		System.out.println("result1 = "+ result1);
		
		short s1 = 32767;//short ǥ������: -32,768 ~ 32,767
		short s2 = 32767;
//		short result2 = s1 + s2;
		int result2 = s1 + s2;//32bit(4byte)�̸� short�� �����͸� �����ϸ� 32bit�� �°�
		
		System.out.println("result2 = " + result2);
		
		System.out.println("============");
		
		int in1 = 1000;
		long lg1 = 2000;
		long result3 = in1 + lg1;//in1�� �ڷ��� int -> long
		System.out.println("result3 = " + result3);
		
		double du1 = 5.3;
		int in2 = 20;
		double result4 = du1 + in2;//in2�� �ڷ��� int -> double
		System.out.println("result4 = " + result4);
		
		
		
	}
}
