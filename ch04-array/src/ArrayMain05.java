public class ArrayMain05 {
	public static void main(String[] args) {
		//�迭�� ���� �� ����
		String[] array = new String[3];
		//�迭���ʱ�ȭ
		array[0] = "Java";
		array[1] = "JSP";
		array[2] = "Servlet";
		//�ݺ����� �̿��� �迭�� ��� ���
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("---------------");
		
		//Ȯ�� for���� �̿��� �迭�� ��� ���
		for(String s: array) {
			System.out.println(s);
		}
	}
}
