package ch06;

//������ ���� Ÿ�� -> ���� Ÿ������ �ڵ� Ÿ�� ��ȯ promtion
public class PromotionExample {

	public static void main(String[] args) {
		//byte -> int
		byte byteValue = 10;//-128~127
		int intValue=byteValue;//10
	System.out.println(intValue);	
   		
		//char ->int
		char charValue='��';
	System.out.println('\uac00');
		intValue=charValue;//'��' -> 0xac00 ->
		                   // a*16^3+c*16^2+0+0-> 10*16^3+12*16^2+0+0=44032
	System.out.println(intValue);
		
		//int -> long
		intValue=500;
		long longValue=intValue;
    System.out.println(longValue);		
		
		//int -> double
		intValue=200;
		double doubleValue=intValue;
	System.out.println(doubleValue);	
		
	
	

	}

}
