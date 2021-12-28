package kr.s01.list;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProductMain {
	ArrayList<Product> list;
	BufferedReader br;
	
	//������
	public ProductMain() {
//		ArrayList<Product> list = new ArrayList<Product>(); //�̷����ص��� ��������� �����ϱ����� ����������
		list = new ArrayList<Product>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));//br�� �����ڿ����� ����ϰ� input()������ ����ϴϱ� ��������� �����ؾ��Ѵ�
			//�޴� ȣ��
			callMenu();
		}catch(IOException e) {
			//�ֿܼ� ���������� ���ܹ��� ǥ��
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();} catch(IOException e) {}//�ڿ������Ҷ��� �Ѷ������� ���
		}
	}
	//�޴�ȣ��
	public void callMenu() throws IOException{
		while(true) {
			//���ڰ��ƴѰ��Է��ϸ� ���Ϲ��� �ӹ���
			try {
				System.out.print("1.��ǰ �Է�, 2.��ǰ ��� ����, 3.���� > ");
				int num = Integer.parseInt(br.readLine());//�Ѷ����� �������Է��� ����ġ�� ���ʹ»������ �׵����Ͱ�
				if(num == 1) {
					input();
				}else if(num == 2) {
					output();
				}else if(num == 3) {
					System.out.println("���α׷� ����");
					break;
				}else {
					System.out.println("�߸� �Է��߽��ϴ�.");
				}
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� ���!");
			}
		}
	}
	
	//��ǰ�Է¸޼ҵ带 ����� �ݸ޴��� �ʹ� ��������������ϱ� �������� ���� ���� �������
	public void input()throws IOException{
		Product p = new Product();
		//set�޼ҵ带 �̿��ؼ� �����͸� �־��ش�
		System.out.print("��ǰ��:");
		p.setName(br.readLine());
		
		System.out.print("��ǰ��ȣ:");
		p.setNum(br.readLine());
		
		System.out.print("����:");
		p.setPrice(Integer.parseInt(br.readLine()));
		
		System.out.print("������:");
		p.setMaker(br.readLine());
		
		System.out.print("���:");
		p.setStock(Integer.parseInt(br.readLine()));
		
		//Product��  ArrayList�� ����
		list.add(p);
		
	}
	//��ǰ��Ϻ���
	public void output(){
		System.out.println("��ǰ��\t��ǰ��ȣ\t����\t������\t���");
		System.out.println("---------------------------");
		//Ȯ��for��
		for(Product p:list) {
			System.out.printf("%s\t",p.getName());
			System.out.printf("%s\t",p.getNum());
			System.out.printf("%,d��\t",p.getPrice());
			System.out.printf("%s\t",p.getMaker());
			System.out.printf("%s\n",p.getStock());
		}
	}
	
	public static void main(String[] args) {
		//main������ ��ü�� �����ϱ⿡ �����ϴ�
//		Product p = new Product();
		new ProductMain(); //�۾��� callMenu���� ���� ���ϱ⶧���� 
	}
}
