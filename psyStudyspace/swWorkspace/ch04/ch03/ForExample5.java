package ch03;

public class ForExample5 {
	public static void main(String[] args) {
		//for���� ����,��������� ��Ȯ�Ҷ� �ַ� ���
		int sum=0;//�ʱ�ȭ
		for(int i=1;i<=10;i++) {//1~10
			sum+=i;//sum=sum+i;
		}
		System.out.println("�հ�:"+sum);
		
		sum=0;//�ʱ�ȭ
		for(int i=1;i<=10;i++) {
			if(i%2==0) sum+=i;
		}
		System.out.println("¦���� �հ�:"+sum);
		
		sum=0;//�ʱ�ȭ
		for(int i=10;i>=1;i--) {
			sum+=i;
		}
		System.out.println("�հ�:"+sum);

	}

}
