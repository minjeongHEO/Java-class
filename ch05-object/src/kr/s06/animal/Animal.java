package kr.s06.animal;

public class Animal {
	//������� ����ȭ
		private String name;//�̸�
		private int age;//����
		private boolean fly;//���� ���� //string���� ���������� true�� ������ �����ϰ� �ٸ��ܾ�� �Է½� (���ɺҰ���/�������Ұ�)���������ִ�.
		
		public Animal() { //����Ʈ �����ڸ� ������ main�ڹٿ� 6���� �����ȳ���,
//			�Ʒ��� �Ķ�����ִ� �����ڰ� �ֳ������� �ڵ����� �ȸ�����ֱ⋚�����̴�
			
		}
		public Animal(String name, int age, boolean fly) {
			//�������   = ��������
			 this.name = name;
			 this.age = age;
			 this.fly = fly;
		}
		
		
		
		//���� ȣ���� ���ϴ»�Ȳ���� �޼ҵ带 �̿��ؼ� ȣ���Ѵ�.
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public boolean isFly() {
			return fly;
		}
		public void setFly(boolean fly) {
			this.fly = fly;
		}
		
}
