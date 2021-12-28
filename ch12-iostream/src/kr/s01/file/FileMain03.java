package kr.s01.file;

import java.io.File;
import java.io.IOException;

public class FileMain03 {
	public static void main(String[] args) {
		//������(��ü���)
		String path = "C:\\javaWork\\sample.txt";
		
		//�����
//		String path = "sample.txt"; //Ư����ο��� �̰� ã�´� �ڹٴ� �̰�쿡 ������Ʈ���� ã�ų� �����
		
		//���ϰ�ü�����
		File f1 = new File(path);
		System.out.println("----���ϻ���----");
		
		try {
			//������ ��θ� ������� ���ϻ���, ������ �����Ǹ� true��ȯ, �������� ������ false��ȯ,
			//��ΰ� �߸��Ǹ� IOExeption�߻�
			System.out.println(f1.createNewFile());//Ʈ����ĳġ���ϸ� ��������.������ ������ �������� Ʈ���ȯ/������ �޽���ȯ
 		}catch(IOException e) {
			e.printStackTrace();//���ܹ������
		}
		System.out.println("========���� ����=======");
		System.out.println("���� ���: "+ f1.getAbsolutePath());//�����α��ϴ� �޼ҵ�
		System.out.println("��� ���: "+ f1.getPath());//����α��ϴ� �޼ҵ�
		System.out.println("���丮��: "+ f1.getParent());//(���丮���� ����ο��� �̾ƿ��°��̴�)
		System.out.println("���ϸ�: "+ f1.getName());
	}
}
/*�����ϸ� Ʈ����µǰ� ��Ű���ͽ��÷η� �ǿ��� ������Ʈ���� ������ �������� ����� ���ϻ����Ȱ� ���δ�
 * �����ǰ� �� �����ϸ� �޽��� ��µȴ� �̹� �����Ƿ�.
 * �����ϰ� �����ϸ� Ʈ��
 * �����ο��� ��θ� ��Ȯ�ϰ� �������������� ��°����������.
 */
