package kr.s04.thistest;

public class ThisMain03 {
	//����ȭ`
	//�������
	private String name;
	private String job;
	private int age;
	private int phone;
	private String address;
	private String hobby;
	private int level;
	
	//ĸ��ȭ
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//���������� ������������ �����ϰ� �����߱� ������ 
		//�޼��峻���� this�� �̿��ؼ� ��������� ���������� ����
		
		this.name = name;// �������(�Ķ���) ��������(����)
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	//��Ŭ������ ������ �����ؼ� ǥ�������� �������
	
}
