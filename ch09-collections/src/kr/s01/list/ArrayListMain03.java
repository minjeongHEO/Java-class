package kr.s01.list;
//���׸�����Ʈ�� �̿��ؼ� ������ �߰��ϱ�
import java.util.ArrayList;

public class ArrayListMain03 {
	public static void main(String[] args) {
		//���׸� ǥ�� : ��ü�� ������ �� ��ü�� ������ ���ִ� ����� Ÿ���� ����
		//���׸� ǥ���� ���� ������ Ÿ������ ����ȴ�.//ObjectŸ�Ծƴ϶� StringŸ������ ����
		ArrayList<String> al = new ArrayList<String>();
//		�׷��Ƿ� �ٿ�ĳ���� ���ص� �ȴ�
//		���׸�ǥ�� ���� ���� �������!
//		ArrayList al = new ArrayList();
		
		al.add("����");//StringŸ��->ObjectŸ�� //���׸�ǥ������ ObjectŸ�Ծƴ϶� StringŸ������ ����
		al.add("�λ�");//StringŸ��->ObjectŸ�� //���׸�ǥ������ ObjectŸ�Ծƴ϶� StringŸ������ ����
		//���׸� ǥ���� �Ἥ ArrayList��ü�� ������ �� ����Ǵ� ��ü�� Ÿ����
		//String���� �����ؼ� IntegerŸ���� ��ü�� ������ �������� �������ش�.
//		al.add(1000);//IntegerŸ��->ObjectŸ�� 
		al.add("��õ");//StringŸ��->ObjectŸ�� //���׸�ǥ������ ObjectŸ�Ծƴ϶� StringŸ������ ����
		
		//�Ǽ��� IntegerŸ���� �����͸��ְ� �𸣴� ��Ȳ�� ����
		//�ݺ����� �̿��� ArrayList ��� ���
		for(int i=0;i<al.size();i++) {
//			String name = (String)al.get(i);
			String name = al.get(i);//���׸� ǥ���� �����Ƿ� �ٿ�ĳ���� �Ⱦ���
			System.out.println(name);
		}
		System.out.println("---------Ȯ�� for�� ����غ���--------");
		for(String name : al) {
			System.out.println(name);
		}
		
	}
}
