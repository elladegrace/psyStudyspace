package ch01;

public class BitReverseOperationExample {

	public static void main(String[] args) {
	 int v1=10;//000000000000000000001010
	 int v2 =~v1;
	 int v3 =~v1+1;//��Ʈ���� 
	 //System.out.println(Integer.toBinaryString(10));
	 System.out.println(toBinaryString(v1));
	 System.out.println(toBinaryString(v2));
	 System.out.println(toBinaryString(v3));
	 System.out.println(v3);

	}
	
	//intŸ���� ���� �޾Ƽ� ó���� StringŸ������ �����ϴ� �޼ҵ�
	public static String toBinaryString(int value) {
		String str=Integer.toBinaryString(value);
		while(str.length()<32) {
			str="0"+str;
			System.out.println(str);
		}
		return str;
		
	}

}
