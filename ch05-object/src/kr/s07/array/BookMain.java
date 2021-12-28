package kr.s07.array;

public class BookMain {
	public static void main(String[] args) {
		//�迭 ���� �� ����
		Book[] bookArray = new Book[3]; //null�� �ʱ�ȭ, null:��ü�� �����ȴ뼭 �ּҰ� ���ٴ��ǹ�
		int total = 0;
		
		//Book��ü�� 3�� �����ؼ� �迭�� ����
		bookArray[0] = new Book("IT","Java",5000,0.05);//�������ϰ� �ּҸ� ��������.		
		bookArray[1] = new Book("�̼�","����",4000,0.03);//�迭�ȿ��� �ּҸ� ����
		bookArray[2] = new Book("����","�Ƹ���",6000,0.06);
		
		//�迭�� ��� ���
		System.out.println(bookArray[0]);// ���ּҸ� ���ؼ� ��ü�� �����ϰڴ�
		System.out.println(bookArray[1]);
		System.out.println(bookArray[2]);
		System.out.println("-------------------------------");
		
		//�ݺ����� �̿��ؼ� �迭�� �����ؼ� ��ü�� ȣ���ϰ� ��ü�� ��������� ����� ������ ���
		for(int i=0;i<bookArray.length;i++) {
			System.out.print(bookArray[i].getCategory()+"\t");
			System.out.print(bookArray[i].getName()+"\t");
			System.out.printf("%,d��\t",bookArray[i].getPrice());
			System.out.printf("%.2f%% \n",bookArray[i].getDiscount());
			//�հ�
			total += bookArray[i].getPrice();
		}
		//�հ� ���
		System.out.printf("å ������ �� : %,d��\n",total);
		
		System.out.println("=================================");
		//Ȯ�� for���� �̿��ؼ� ������ ���
		for(Book book : bookArray) {//���������տ��� �׻� �ڷ����� ���ش�> �����ڷ���������(Ŭ�������� �������)
			//						bookArray�� ��ü�� �ּҸ� ���� �޴´�
			System.out.printf("%s\t",book.getCategory());
			System.out.printf("%s\t",book.getName());
			System.out.printf("%,d��\t",book.getPrice());
			System.out.printf("%.2f%%\n",book.getDiscount());
		}
		System.out.println("=================================");
		
	}
	
}
