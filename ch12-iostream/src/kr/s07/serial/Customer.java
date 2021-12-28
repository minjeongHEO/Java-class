package kr.s07.serial;

import java.io.Serializable;
/*
 * Serializable 인터페이스를 구현하면 해당클래스는 객체 직렬화 대상이 되어 
 * 언제든지 객체 직렬화를 수행할 수 있음.
 * Serializable이 구현되지않으면 객체 직렬화 불가능
 * 직렬화대상은 멤버변수만 직렬화 대상
 * 생성자 메서드들은 직렬화기록이 안됌
 * implements 반드시 해줘야함
 * 직렬화하고 클래스파일 삭제하면 안됀다
 */
public class Customer implements Serializable{ //구현되있는지만 보고 구현되있으면 직렬화가능 (마킹만한다 별도로 구현할 메서드 없음)
//멤버변수
	private String name; 
	
//생성자를 통해서 정보를 넣어보겠다
//생성자 메서드들은 직렬화기록이 안됌
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
