public class OperatorMain05 {
	public static void main (String[] args) {
		System.out.println("=====��������=====");
		boolean a,b,result;
		a = true;
		b = false;
		
		result = a && b;//����, ������ �� ������ ��� true�̸� ������� true
		System.out.println("a && b : " + result);
		
		result = a || b;//����, ������ �Ǵ� ������ �ϳ����̶� true�̸� ������� true
		System.out.println("a || b : "+ result);
		
		result = !a;//������
		System.out.println("!a : " + result);
	
	}
}
