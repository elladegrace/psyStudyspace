package ch06;

public class BitOperationShift {
	public static void main(String[] args) {
	 short a = (short)0x55ff;
	 short b = (short)0x00ff;
	 System.out.println(toBinaryString(a));
	 System.out.println(toBinaryString(b));
	 
	 //��Ʈ �� ����
	 System.out.println("[��Ʈ ���� ���]");
	 System.out.printf("%04x\n",(short)(a&b));//��Ʈ AND
	 System.out.printf("%04x\n",(short)(a|b));//��Ʈ or
	 System.out.printf("%04x\n",(short)(a^b));//��Ʈ xor
	 System.out.printf("%04x\n",(short)(~a));//��Ʈ not

	}
	
	static String toBinaryString(int value) {
		String str=Integer.toBinaryString(value);
	 while(str.length()<16) {
		  str="0"+str;
	 }
	 return str;
	}

}
