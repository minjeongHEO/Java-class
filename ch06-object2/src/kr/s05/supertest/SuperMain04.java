package kr.s05.supertest;

//�θ�Ŭ����
class Point{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
}
	public String getLocation() {
		return "x :" +x+ ", y:"+y;
	}
}
//�ڽ�Ŭ����
class Point3D extends Point{
	int z;

	public Point3D(){
//		x = 10;
//		y = 9;
		super(10,9);
		z = 7;
		/*public Point3D(int x, int y, int z){
		 * �θ�Ŭ������ ���ڰ� �ִ� ������ ȣ���ϱ�
		 * super(x,y);
		 * this.z=z;
		 * }
		 */
		
	}
	
	//�޼��� ������
	@Override
	public String getLocation() {
		return "x: "+ x +", y: "+ y +",z:" +z;

	}
}
public class SuperMain04 {
	public static void main(String[] args) {
		Point3D p3 = new Point3D();
		/* point3D p3 = new Point3D(10,9,7); */
		System.out.println(p3.getLocation());
	}
}
