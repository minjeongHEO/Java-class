package kr.s01.string;

public class StringMain05 {
	public static void main(String[] args) {
		String str = "abcMDye-4W?EWzz";
		String result = "";//���ڿ� �ʱ�ȭ�Ҷ� �� �� �ֵ�
		/*
		 * str�� ����� ���ڿ����� �ҹ��ڴ� �빮�ڷ� ����, �빮�ڴ� �ҹ��ڷ� �����ؼ� ���
		 *ABCmdTE-4w?ewZZ�� ��� 
		 *�ƽ�Ű�ڵ� 65~90 ������ �빮��
		 *		97~122 ������ �ҹ���	
		 */
		
//		char c;
//		int i;
//		
//		for(i=0;i<str.length();i++) {
//			if(str.charAt(i)<=90 && str.charAt(i)>=65 ) {
//				c = str.toLowerCase(i);//�빮�� -> �ҹ���
//				System.out.println(c);
//				result = "";
//				
//			}else if(str.charAt(i)<=122 && str.charAt(i)>=97){
//				c = str.toUpperCase(i);
//				System.out.println(c);
//				result = "";
//				
//			}else
//				c = str.charAt(i);
//				System.out.println(c);
//				result = "";
//		}
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c>=65 && c<=90) {//�빮��
//				���ڸ� ���ڿ��� �ٲ���Ѵ�
				result += String.valueOf(c).toLowerCase(); //���ڿ��� ��ȯ���ش�
			}else if(c>=97 && c<=122) {//�ҹ���
				result += String.valueOf(c).toUpperCase(); //���ڿ��� ��ȯ���ش�
			}else {
				result += c;
			}
		}
		
		System.out.println(result);
		
	}
}
