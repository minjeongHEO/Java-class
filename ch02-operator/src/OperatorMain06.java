public class OperatorMain06 {
	public static void main(String[] args) {
		//����������, �񱳿�����, ��������
		int a,b;
		a=b=10;
		
		boolean c = a++ >= ++b && ++a > b++; 
//					10		11
//					false	
		System.out.println(a + ","+b);
		System.out.println("c =" + c);
		System.out.println(c);
//		�����ǿ��� false�̹Ƿ� �ڿ� ������ ���������ʾƵ� �ٷ� false����� ���
		
		System.out.println("-----------------");
		
		int d, e;
		
		d=e=10;
		boolean f = ++d > e++ || d++ >= ++e; // �ι�°���� �򰥸� ���Ӱ� �ϴ��� �̾ �����ϴ���?
//					11	  10      
//					true
		System.out.println(d + "," + e);//e ��°��� 11�ΰ��� �������� �������������Ƿ� �������� e++�� �������? 
		System.out.println("f=" + f);

		d=e=10;
		
		boolean j = ++d > e++ && d++ >= ++e; // �����ǿ��� d�ǰ��� ������ ���ǵ� 10���� ���� �ٽ� �����ϴ��� x
											//	�����ǿ����� 11�������� ����Ǵ���? o
//					11	  10      11    12
//					true 	 && 	false 	-> false
		System.out.println(d + "," + e);//d=12 e=12
		System.out.println("f=" + j);
	}
}
