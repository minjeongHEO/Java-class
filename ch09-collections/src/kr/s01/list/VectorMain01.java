package kr.s01.list;
//ArrayList(동기화체크안함)랑 비슷한구조,비슷한메소드(벡터보다는 어레이리스트가 동작이더 빨라서 더많이 사용)
import java.util.Vector;

public class VectorMain01 {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		//객체
		v.add(100.3);
		v.add(3.14);
		v.add(1000.0);//double 데이터
//		v.add(1000.);1000.0으로 인식함
		
		//확장 for문
		for(Double n : v) {
			System.out.println(n);//Vector에 저장된 요소 출력
		}
		//자원 검색
		double search = 1000.0;//검색할 요소
		int index =v.indexOf(search);
		if(index != -1) {//검색할 요소가 없다면
			System.out.println("검색 요소 "+search+"의 위치: "+index);
		}else {
			System.out.println("검색 요소 "+search+"가 없습니다.");
		}
		
		//자원 삭제
		double del = 3.14;//삭제할 요소
		if(v.contains(del)) { //contains() :검색할 요소가 있는지 검사한다
			v.remove(del);//삭제
			System.out.println(del+"삭제완료!!");//컨테인즈로 중복허용안함
		}
	}
}
