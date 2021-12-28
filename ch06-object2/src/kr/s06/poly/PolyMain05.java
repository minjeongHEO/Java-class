package kr.s06.poly;

//!!!!!!!!!�θ� Ŭ����
class Product{
	int price; //��ǰ�� ����
	int bonusPoint; //��ǰ ���Ž� �����ϴ� ���ʽ� ����
	
	public Product(int price) { //������
		this.price = price;
		bonusPoint = price/10; //���ʽ� ������ ��ǰ ������  10%
	}
	
	public String getName() { //�޼���
		return "��ǰ";
	}
	
}
//�ڽ�Ŭ����
class Tv extends Product{ //����Ʈ�����ڰ� �ڵ������� ȣ��Ǵµ� �θ� ����������ڰ� ��� ������
	public Tv() { //������
		super(200);	//���ڰ� �ִ� ���۸� ����ؾ� ���� �������
	}
	@Override
	public  String getName() {
		return "Tv";
	}
}
//�ڽ�Ŭ����2
class Computer extends Product{
	public Computer() {
		super(300);
	}
	public String getName() {
		return "Computer";
	}
}
//�ڽ�Ŭ����3
class Audio extends Product{
	public Audio() {
		super(400);
	}
	@Override
	public String getName() {
		return "Audio";
	}
}
class Buyer{ //�� Ŭ����
	int money = 1000; //�����ݾ�
	int bonusPoint = 0; //��int bonusPoint;�� �ص� �� �����ڰ� 0���� �ʱ�ȭ ���ֱ⋚����
	
	//�����ϱ�
	/*public void buy(Tv tv) { //tv�� �޼ҵ带 ���� ���Ű� ���������� ��ǻ�ʹ� ���Ÿ���
		
	}
	public void buy(Computer computer) { //��ǻ�� �޼ҵ带 ����� �����ذ������� ������ �޼ҵ带 �� �߰��ؾ���
		
	}*/
	public void buy(Product p) { //�׷��� �θ�Ŭ���� �ϳ��θ� ���α׷����Ѵ�
		/*ù��° ���
		 * if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ������ �� �����ϴ�.");
		}else {
			money -= p.price;
			(return;) void���� �� �����ִ� ���ÿ� ��ø� ���Ѵ�.
		}*/
		/*�ι�° ���*/
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ������ �� �����ϴ�.");
			return; //�޼��带 ��������(�޼��� ����) void���� ��쿡�� �� ������
		}
		money -= p.price; //���϶����� if else ȿ���� �����ֵ�
		bonusPoint += p.bonusPoint;//��ǰ�� ���ʽ� ����
		
		System.out.println(p.getName()+"�� �����ϼ̽��ϴ�");
		System.out.println("���� ���� ���� " + money +"�����Դϴ�");
		System.out.println("���� ���ʽ� ������ " + bonusPoint +"�� �Դϴ�");
		/*���� ����
		 * if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ������ �� �����ϴ�.");
			return; //�޼��带 ��������(�޼��� ����) void���� ��쿡�� �� ������
		}else {
			
		}�� �����̹Ƿ� return�� else�� ���� ��������ʴ´� */
	}	
	
	
}
public class PolyMain05 {
	public static void main(String[] args) {
		//�� ��ü ����
		Buyer b = new Buyer();
		//Tv ��ü ����
		Tv tv = new Tv();
		//Computer ��ü ����
		Computer com = new Computer();
		//Audio ��ü ����
		Audio au = new Audio();
		
		//�����ϱ�
		b.buy(tv);//Tv -> Product ����ȯ (�ڽ�Ŭ����Ÿ�� -> �θ�Ŭ����Ÿ��)
				//��ĳ����
		System.out.println("---------------");
		
		b.buy(com); //Computer -> Product ����ȯ(�ڽ�Ŭ����Ÿ��->�θ�Ŭ����Ÿ��)
					//��ĳ����
		System.out.println("---------------");

		b.buy(au);//Audio->Product ����ȯ
	}
}
