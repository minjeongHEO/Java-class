package kr.s03.output;

import java.io.IOException;

public class StandardInput01 {
	public static void main(String[] args) {
		//�ڹ��� �⺻ �Է�
		try {
			System.out.print("������ 1�� �Է�> ");
			int a = System.in.read(); //System.in�� �̿��� ��ǲ��Ʈ���� ��ȯ�ϴµ� ��ǲ��Ʈ���� �������ִ� ����޼ҵ带 �̿��ؼ� �۾����Ѵ� �ٵ� Ʈ����ĳġ�϶�� �ϴ� �Ѵ�.
									//int �ѹ��ھ� �о�鿩�� �ƽ�Ű�ڵ�� ��ȯ��Ų��-> ������ó���Ҽ��ִٴ°�
									//���� �ϳ��� �Է¹޾Ƽ� �ƽ�Ű�ڵ�� ��ȯ
//									�����ؼ� �Ⱦ�
			System.out.println(a+","+(char)a);
			
			System.in.read();//enter ó�� \r =13
			System.in.read();//enter ó�� \r =10
			//�Է¸��ް� ��������غ����� ���ֹ�����
			System.out.println("---------------------");
			
			System.out.print("���� 1�� �Է�>");
			int b= System.in.read() -48;
			System.out.println(b); // \r\n=����
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
