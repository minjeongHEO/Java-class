package kr.s01.list;

public class ScoreValueException extends Exception{
	//사용자 정의 예외클래스
	//
	public ScoreValueException(String message) {
		super(message);//익셉션에 전달
	}
}
//여기서는 그냥 상속관계만 명시하는거