package kr.s07.serial;

import java.io.Serializable;
/*
 * Serializable �������̽��� �����ϸ� �ش�Ŭ������ ��ü ����ȭ ����� �Ǿ� 
 * �������� ��ü ����ȭ�� ������ �� ����.
 * Serializable�� �������������� ��ü ����ȭ �Ұ���
 * ����ȭ����� ��������� ����ȭ ���
 * ������ �޼������ ����ȭ����� �ȉ�
 * implements �ݵ�� �������
 * ����ȭ�ϰ� Ŭ�������� �����ϸ� �ȉ´�
 */
public class Customer implements Serializable{ //�������ִ����� ���� ������������ ����ȭ���� (��ŷ���Ѵ� ������ ������ �޼��� ����)
//�������
	private String name; 
	
//�����ڸ� ���ؼ� ������ �־�ڴ�
//������ �޼������ ����ȭ����� �ȉ�
	public Customer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
