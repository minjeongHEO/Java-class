public class ArrayMain10 {
	public static void main(String[] args) {
		//구구단 만들기
		/*
		 * 단을 입력받아서 1~9까지 곱해서 결과값을 구하고 배열에 그값을 저장한 후 
		 * 구구단 출력 형식(2*1=2)으로 배열에서 값을 불러와 출력.
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int[] array = new int[9];
		
		System.out.print("단 입력>");
		int dan = input.nextInt();
		
		for(int i=1;i<=array.length;i++) {
			array[i-1]= dan*i;
			System.out.println(dan +" * " + i + " = " + array[i-1]);
		}
		
		input.close();
	}
}
