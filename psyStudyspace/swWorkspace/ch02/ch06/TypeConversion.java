package ch06;

public class TypeConversion {
	public static void main(String[] args) {
		byte b=127;
		int i=100;
		
		//byte +int -> int + int => int
		System.out.println(b+i);
		//int / int -> int
		System.out.println(10/4);// 10=2*4+2=>10�� ���� 2�̰�, �������� 2
		
		//54�ڷ��� ������ �ֽ��ϴ�. 12���� �л����� ���ڷ羿 �������ְ�, ���� ������ ��ΰ���?
		//54=12*4+6, 54/12=4,
		System.out.println("��:"+(54/12));
		System.out.println("������:"+(54-(54/12)*12));
		
		//double/int -> double/double(10.0)/4.0 -> 2.5
		System.out.println(10.0/4);
		//int ->char ->���� 3byte�� �����, ������ 2byte�� ��ȿ
		System.out.println((char)0x12340041);
		
		//int->byte�� ��ȯ�� �����÷ο� �߻�
		System.out.println((byte)(b+i));
		
		//2.9->intŸ�� 2 + 1.8 -> double 2.0 +1.8 -> 3.8
		System.out.println((int)2.9+1.8);
		
		//double+dobule(2.9+1.8=4.7) ->int 4
		System.out.println((int)(2.9+1.8));
	
		//double2.9->int 2, double 1.8 -> int 1, int +int 2+1=3 
		System.out.println((int)2.9+(int)1.8);
		

	}

}
