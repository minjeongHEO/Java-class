package kr.s03.extention;

public class PhoneMain {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("010-1234","A1001","white","안드로이드");
		FeaturePhone fp = new FeaturePhone("010-4321","Z1001","black",80000);
		
		System.out.println("========================");
		System.out.println("번호\t모델\t색상\t옵션(OS/화소수)");
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
