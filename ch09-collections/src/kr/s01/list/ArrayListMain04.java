package kr.s01.list;
//���׸�����Ʈ�� �̿��ؼ� ������ �����ϱ�
import java.util.ArrayList;
public class ArrayListMain04 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("���");//�ε���0
		al.add("����");//�ε���1
		al.add("�ٳ���");//�ε���2
		al.add("������");//�ε���3

		//�ݺ����� �̿��� ArrayList��� ���
		for(int i =0; i<al.size();i++) {
			String name = al.get(i);
			System.out.println(i+":"+name);
		}
		System.out.println("-------------");
		for(int i =0; i<al.size();i++) {
			System.out.println(i+":"+al.get(i));//���ʿ��� ������ ���� �Ⱦ������� ������ ������ �����ؾ��ϹǷ�
		}
		System.out.println("----����� ����----");
		al.remove(2);//�ε����� ���
		//������� �ε��� ������ �Ͼ�� (�迭�� ������ ������ ���������� ������ �ȉ�)
		al.remove("���");//��Ҹ� ���
		for(int i =0; i<al.size();i++) {
			System.out.println(i+":"+al.get(i));
			System.out.println("---------------");
		}

			ArrayList<Integer>al2 = new ArrayList<Integer>();
			al2.add(10);//0
			al2.add(5);//1
			al2.add(3);//2
			al2.add(20);//3
			for(int e=0; e<al2.size();e++) {
				System.out.println(e+":"+al2.get(e));
			}
			System.out.println("---------------");
			//����� ����
			//a12.remove(2);//�ε���
			Integer n =10;
//			al2.remove(new Integer(10));//���ø�����Ʈ�Ǽ� ��������
			al2.remove(n);//���
			for(int e=0; e<al2.size();e++) {
				System.out.println(e+":"+al2.get(e));
			}
			System.out.println("---------------");
			//����� ����
			al2.set(1,30);
			for(int e=0; e<al2.size();e++) {
				System.out.println(e+":"+al2.get(e));
			}
			System.out.println("---------------");
		}
	}


