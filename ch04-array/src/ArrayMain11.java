public class ArrayMain11 {
	public static void main(String[] args) {
		//2���� �迭 ����
//		int[][] test;
		int test[][];
		
		//2���� �迭 ����
		test= new int [2][3];//2��3���� 2���� �迭
		
		//2���� �迭�� �ʱ�ȭ
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		//�迭�� ��� ���
		System.out.println(test[0][0]);
		System.out.println(test[0][1]);
		System.out.println(test[0][2]);
		System.out.println(test[1][0]);
		System.out.println(test[1][1]);
		
		//2�� �ݺ����� �̿��ؼ� 2���� �迭�� ��� �б�
		for(int i=0;i<test.length;i++) { //��, i:0~1
//			for(int j=0;j<3;j++) { //��, j:0~2
			for(int j=0;j<test[i].length;j++){
				System.out.println("test["+i+"]["+j+"]:" + test[i][j]);
			}
		}
		
		//2���� �迭 ���� �� ����
		int [][] test2 = new int [3][5]; //3��5���� 2���� �迭
		
		//2���� �迭 ���� �� ����(����� �迭 ����), �ʱ�ȭ
		int[][] test3 = new int[][] {{100,200,300},{400,500,600}};
		
		//2���� �迭 ���� �� ����(�Ͻ��� �迭 ����), �ʱ�ȭ
		int[][] test4 = {{10,20,30},{400,500,600},{}};
	}
}
