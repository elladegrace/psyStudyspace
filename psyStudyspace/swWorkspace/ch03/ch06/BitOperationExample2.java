package ch06;

public class BitOperationExample2 {

	public static void main(String[] args) {
		byte flag=0b00001010;//�� ��Ʈ�� 8���� ���� ���� ����Ŵ
		
		//   0b00001010
		// & 0b00001000
		//   0b00001000
		if((flag & 0b00001000)==0) {
			System.out.println("�µ��� 0�� ����");
		}else
			System.out.println("�µ��� 0�� �̻��Դϴ�.");
	}
}
