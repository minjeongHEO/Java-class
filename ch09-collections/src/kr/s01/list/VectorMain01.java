package kr.s01.list;
//ArrayList(����ȭüũ����)�� ����ѱ���,����Ѹ޼ҵ�(���ͺ��ٴ� ��̸���Ʈ�� �����̴� ���� ������ ���)
import java.util.Vector;

public class VectorMain01 {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		//��ü
		v.add(100.3);
		v.add(3.14);
		v.add(1000.0);//double ������
//		v.add(1000.);1000.0���� �ν���
		
		//Ȯ�� for��
		for(Double n : v) {
			System.out.println(n);//Vector�� ����� ��� ���
		}
		//�ڿ� �˻�
		double search = 1000.0;//�˻��� ���
		int index =v.indexOf(search);
		if(index != -1) {//�˻��� ��Ұ� ���ٸ�
			System.out.println("�˻� ��� "+search+"�� ��ġ: "+index);
		}else {
			System.out.println("�˻� ��� "+search+"�� �����ϴ�.");
		}
		
		//�ڿ� ����
		double del = 3.14;//������ ���
		if(v.contains(del)) { //contains() :�˻��� ��Ұ� �ִ��� �˻��Ѵ�
			v.remove(del);//����
			System.out.println(del+"�����Ϸ�!!");//��������� �ߺ�������
		}
	}
}
