package ch06;

public class BitOperatonShift2 {
	public static void main(String[] args) {
		byte c=20;//0x14;
		byte d=-8;//0xf8;
		
		//��Ʈ ����Ʈ ����
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c<<2);
		System.out.println(c>>2);
		System.out.println(d>>2);//������ȣ 1��Ʈ 1�� ä����
		System.out.println(d>>>2);//0�� ä����
		System.out.printf("%x\n",(d>>>2));
		

	}

}
