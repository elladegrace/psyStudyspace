package ch01;

public class SignExample {
	public static void main(String[] args) {
		//��ȣ���� +,-��ȣ
		//���ͷ��� -100�Է� ����
		byte x = -100;
		System.out.println(x);
		
		//��������� ����� intŸ������ ��ȯ
		//byte result1 = -x;
		//System.out.println(result1);
		int result1 = -x;//-(-100) => 100
		System.out.println(result1);
		//byte result2 = +x;
		int result2=+x;
		System.out.println(result2);
		

	}

}
