package ch08;

//���� Ÿ�� ��ȯ �� �����÷ο� ���� Ȯ��
public class CheckBeforeCasting {

	public static void main(String[] args) {
		int i=125;
		
		if(i<Byte.MIN_VALUE ||i>Byte.MAX_VALUE) {
			System.out.println("byte Ÿ������ ��ȯ �Ұ�");
			System.out.println("���� �ٽ� Ȯ���ϼ���");
		}else {
			byte b=(byte)i;
			System.out.println(b);
		}
		
		///
		long j=2147483649L;
		if(j<Integer.MIN_VALUE || j>Integer.MAX_VALUE) {
			System.out.println("intŸ������ ��ȯ �Ұ�");
		}else {
			int k=(int)j;
			System.out.println(k);	
		}

	}
}
