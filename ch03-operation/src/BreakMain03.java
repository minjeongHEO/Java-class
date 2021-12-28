public class BreakMain03 {
	public static void main(String[] args) {
		//		다중 반복문에서 break레이블 사용
		
		exit_for: //break 레이블 지정할 떄 ; 아니라 :으로 끝마친다.
		for(int i =0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(j == 3)
					break exit_for; //break뒤에 레이블을 명시하면
									//레이블이 지정된 for문을 빠져나감

				/*
				 * break는 특정 조건일 떄 반복문을 빠져나감\
				 * 다중 반복문일 때 전체 반복문을 빠져나가는 것이 아니라
				 * break가 포함되어 있는 반복문만 빠져나감
				 */

				System.out.println("i= "+ i + ", j =" + j);
			}
		}	
	}
}
