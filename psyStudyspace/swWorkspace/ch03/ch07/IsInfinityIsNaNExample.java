package ch07;

public class IsInfinityIsNaNExample {
	public static void main(String[] args) {
	 try {
		 int x=5;
		 int y=0;
		// int z=x/y;//���� 0���� ���� ����
		 int z= x%y;
		 System.out.println("z:"+z);
	 }catch(Exception e) {
		 System.out.println("0���� ������ �����ϴ�."+e.getMessage());
	 }

	}

}
