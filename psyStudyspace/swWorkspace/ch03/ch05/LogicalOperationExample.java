package ch05;

public class LogicalOperationExample {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		//���� false , ������ ���� �� 10/0���� ���� �߻�
		if((i != 1) && (10/(--j)!=1) ) {
			System.out.println("false");
		}else
		System.out.println("true");
		
		//���� true, ������ ������ 10/0���� ���� �߻�
		if(i==1 || (10/(--j)!=1)) {
			System.out.println("����");
		}else
			System.out.println("����");
		System.out.println("-------------");
		
		if((i!=1) & --j==0) {
			System.out.println(j);
		}
		System.out.println(j);
		
		if((i!=1) && --j==-1) {
			System.out.println(j);
		}
		System.out.println(j);

	}

}
