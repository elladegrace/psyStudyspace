package ch05;

public class ByteTypeExample {

	public static void main(String[] args) {
		byte b=127;
		//�ʱⰪ���� byteŸ�� ������ ���� �Ұ�, byte���� -128~127
		//byte c=128;
		
		System.out.println(b+1);//byteŸ���� ��+�������ͷ� => ����Ÿ�� 
		
		byte var1=-100;
		int var2=2147483645;
		short var3=32765;
		
		//������������ ���� ��ȭ
		for(int i=0;i<600;i++) {
			var1++;
			var2++;
			var3++;
			System.out.println("var1:"+var1+",var2:"+var2+",var3:"+var3);
		}
		
		

	}

}
