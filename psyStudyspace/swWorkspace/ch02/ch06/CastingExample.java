package ch06;

//������ ���� ����Ÿ Ÿ�Կ��� ������ ���� ����Ÿ Ÿ������ ���� ��ȯ�� ����Ÿ �ս� ����
public class CastingExample {

	public static void main(String[] args) {
		 int intValue1=100;
		 byte byteValue1=(byte)intValue1;
		 System.out.println(byteValue1);
		 
		 intValue1=103029759;
		 byteValue1=(byte)intValue1;
		 System.out.println(byteValue1);
		 
		 short shortValue=(short)intValue1;
		 System.out.println(shortValue);

	}

}
