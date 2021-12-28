package kr.s01.list;
//제네릭리스트를 이용해서 데이터 삭제하기
import java.util.ArrayList;
public class ArrayListMain04 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("사과");//인덱스0
		al.add("망고");//인덱스1
		al.add("바나나");//인덱스2
		al.add("오렌지");//인덱스3

		//반복문을 이용한 ArrayList요소 출력
		for(int i =0; i<al.size();i++) {
			String name = al.get(i);
			System.out.println(i+":"+name);
		}
		System.out.println("-------------");
		for(int i =0; i<al.size();i++) {
			System.out.println(i+":"+al.get(i));//불필요한 변수를 많이 안쓰는쪽이 더좋음 변수를 관리해야하므로
		}
		System.out.println("----요소의 삭제----");
		al.remove(2);//인덱스를 명시
		//공백없이 인덱스 변동이 일어난다 (배열은 데이터 변경은 가능하지만 삭제는 안됌)
		al.remove("사과");//요소를 명시
		for(int i =0; i<al.size();i++) {
			System.out.println(i+":"+al.get(i));
			System.out.println("---------------");
		}

			ArrayList<Integer>al2 = new ArrayList<Integer>();
			al2.add(10);//0
			al2.add(5);//1
			al2.add(3);//2
			al2.add(20);//3
			for(int e=0; e<al2.size();e++) {
				System.out.println(e+":"+al2.get(e));
			}
			System.out.println("---------------");
			//요소의 삭제
			//a12.remove(2);//인덱스
			Integer n =10;
//			al2.remove(new Integer(10));//디플리케이트되서 쓸수없음
			al2.remove(n);//요소
			for(int e=0; e<al2.size();e++) {
				System.out.println(e+":"+al2.get(e));
			}
			System.out.println("---------------");
			//요소의 변경
			al2.set(1,30);
			for(int e=0; e<al2.size();e++) {
				System.out.println(e+":"+al2.get(e));
			}
			System.out.println("---------------");
		}
	}


