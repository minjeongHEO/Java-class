public class ArrayMain04 {
	public static void main(String[] args) {
		//�迭 ���� �� ����, �ʱ�ȭ
		int[]array = {10,20,30,40,50};
		
		for(int i=0;i<array.length;i++) {
			System.out.println("array[" +i+ "]:" + array[i]);
		}
		System.out.println("================");
		
		//������ roop(Ȯ��for��) - �迭���� ���
		//(�迭�� ��Ҹ� ������ ���� :�迭��)
		//num:�迭�� ���(����� ������)�� �о�ͼ� ������ ����
		//array:�迭��
		for(int num : array) { //�� �ݷо��� ���̺������ҋ��� ����
			System.out.print(num+"\t");
			
		}
	}
}
