package ch05;

public class PrimitiveTypeScopeExample {
	public static void main(String[] args) {
 //�⺻Ÿ���� ��üȭ Ŭ����:wrapperŬ���� 		
 //int->Integer, byte->Byte, char->Character, short->Short, long ->Long		
  System.out.println(Integer.MIN_VALUE+"<=int����<="+Integer.MAX_VALUE);
  System.out.println(Byte.MIN_VALUE+"<=byte����<="+Byte.MAX_VALUE);
  System.out.println(Character.MIN_VALUE+"<=char����<="+Character.MAX_VALUE);
  System.out.println(Short.MIN_VALUE+"<=short����<="+Short.MAX_VALUE);	
  System.out.println(Long.MIN_VALUE+"<=long����<="+Long.MAX_VALUE);

  //float -> Float, double -> Double
  System.out.println(Float.MIN_VALUE+"<=float����<="+Float.MAX_VALUE);
  System.out.println(Double.MIN_VALUE+"<=double����<="+Double.MAX_VALUE);
	}

}
