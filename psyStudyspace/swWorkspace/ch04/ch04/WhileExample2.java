package ch04;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {
		int count=0;//���ڰ� �Էµ� ���� �����ϴ� ����
		int sum=0;//�Էµ� ���ڵ��� ���� �� �����ϴ� ����
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���");
		
		int n=scanner.nextInt();
		
		while(n!=-1) {
			sum+=n;//sum=sum+n;
			count++;//count=count+1;
			n=scanner.nextInt();
		}
		if(count==0) System.out.println("�Էµ� ���� �����ϴ�.");
		else {
			System.out.println("������ ������ "+count+"���̸�");
			System.out.println("����� "+(double)sum/count+"�Դϴ�.");
		}
		
		scanner.close();
	}
}
