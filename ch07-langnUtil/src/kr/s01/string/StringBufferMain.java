package kr.s01.string;

public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("여름 덥다!!");
		System.out.println("1: " + sb);//참조변수sb.toString과똑같은거임 근데 재정의 되어서 참조값안나온는거
		//원하는 인덱스에 문자를 추가
				//인덱스,추가하는문자
		sb.insert(2, '이');//대체가아니라 끼워넣는 것
		System.out.println("2: "+sb);
		//기존 문자열 뒤에 문자열 추가
		sb.append("가을은 ");
		System.out.println("3: "+ sb);
		sb.append("시원하다 ");
		System.out.println("4: "+ sb);

		//시작인덱스부터 끝인덱스 전(미만)까지의 문자열을 지정한 대체문자열로 바꾼다
		sb.replace(0,3,"여행가자!!");//스타트인덱스, 엔드인덱스, 대체할문자열
		System.out.println("5: "+sb);
		
		sb.deleteCharAt(0);//해당인덱스의 문자를 삭제
		System.out.println("6: "+ sb);
		
		sb.delete(0, 3);//스타트인덱스, 엔드인덱스-1 삭제
		System.out.println("7: "+ sb);
		
		//StringBuffer -> String 변환
		//타입만 바껴서 출력값은 같다
		String str = sb.toString();
		System.out.println(str);
		
	}
}
