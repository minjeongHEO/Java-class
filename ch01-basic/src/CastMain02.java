public class CastMain02 {
	public static void main(String[] args) {
		System.out.println("=====����� ����ȯ(���� ����ȯ)=====");
		//*ū �ڷ������� ���� �ڷ�������* ������ �Ͼ�� ����,
		//������ �ս��� �߻��� ���� ���� ���� ����.
		
		byte b1 = 127;
		byte b2 = 127;
		//�ڵ������� int�� �°ݵȰ��� byte�� ����� ����ȯ
//		int result1 = b1 + b2; 
		byte result1 = (byte)(b1 + b2); //(�����)�� int�ΰ��� byte�� �ٲ۴ٴ� �� �տ� (byte)�� ������ش� 
						//ĳ��Ʈ �����ڶ�� �Ѵ�.
		System.out.println("result1 = " + result1); //�������� �ְ�, ������ �ս��� �߻���
		
		short s1 = 1000;
		short s2 = 2000;
//		int result2 = s1 + s2;
		short result2 = (short)(s1+s2);//�ᱣ���� ���ؼ� short�� �������.
						//ĳ��Ʈ �����ڶ�� �Ѵ�.
		System.out.println("result2 = " + result2);
		
		System.out.println("==================");
		
		int in1 = 2345;
		float f1 = 25.67f;
		int result3 =  in1 + (int)f1;//f1�� �ڷ��� float -> int�� ���� ����ȯ
		//�Ҽ��� �޺κ��� �����ս� �߻�
		System.out.println("result3 = " + result3);
		
		int in2 = 1234;
		long lg1 = 1234L;
		int result4 = in2 + (int)lg1;//lg1�� �ڷ��� long->int�� ���� ����ȯ
		//������ �ս��� �߻����� ����
		System.out.println("result4 = " + result4);
		
		
	}
}
