package kr.s03.extention;

public class PhoneMain {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("010-1234","A1001","white","�ȵ���̵�");
		FeaturePhone fp = new FeaturePhone("010-4321","Z1001","black",80000);
		
		System.out.println("========================");
		System.out.println("��ȣ\t��\t����\t�ɼ�(OS/ȭ�Ҽ�)");
		System.out.print(sp.getNumber()+"\t");
		System.out.print(sp.getModel()+"\t");
		System.out.print(sp.getColor()+"\t");
		System.out.print(sp.getOs()+"\n");
		
		System.out.print(fp.getNumber()+"\t");
		System.out.print(fp.getModel()+"\t");
		System.out.print(fp.getModel()+"\t");
		System.out.print(fp.getPixel()+"\n");
	}
}
