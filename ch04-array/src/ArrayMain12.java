public class ArrayMain12 {
	public static void main(String[] args) {
		//2���� �迭 ���� �� ����, �ʱ�ȭ
		int[][]array = {
						{10,20,30,40},
						{20,30,40,50}
						}; //2��4��
						
		//�ݺ����� �̿��� ���
		for(int i=0;i<array.length;i++) { //��
			for(int j=0;j<array[i].length;j++) { //��
				System.out.print(array[i][j]+"\t");
			}
			System.out.println(); //�ܼ� �ٹٲ�
			
		}
	}
}
