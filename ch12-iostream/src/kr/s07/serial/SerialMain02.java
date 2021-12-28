package kr.s07.serial;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;

public class SerialMain02 {
	public static void main(String[] args) {
		System.out.println("=====객체 역직렬화 수행=====");
		FileInputStream fis = null; //파일읽어오는 역할
		ObjectInputStream ois =  null;
		
		try {
			fis = new FileInputStream("object.ser");
			ois = new ObjectInputStream(fis);
			
			//역질렬화 수행
//			ois.readObject();//ClssNotFoundException, ioexception캐치블럭에 넣어줘야한다.
			//역직렬화 수행과 반환
			Customer m = (Customer)ois.readObject();//readObject는 "object.ser"읽는다
			System.out.println(m.getName());
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			
		}finally {
			if(ois!=null)try {ois.close();} catch(IOException e) {}
			if(fis!=null)try {fis.close();} catch(IOException e) {}
		}
		
		
	}
}
