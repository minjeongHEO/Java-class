public class ForMain05 {
	public static void main(String[] args) {
//		java.util.Scanner input = new java.util.Scanner (System.in);
		//���� for��
		for(int dan=2;dan<=9;dan++) {//��
			 System.out.println("**"+dan+"�� **");
			 
			 for(int i=1; i<=9; i++) { //�������� ��
				 System.out.println(dan+"*"+ i + "=" + dan*i);
			 }
			 
//		input.close();
		
		}
	}

}
