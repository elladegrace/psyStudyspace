package ch04;

import java.util.Scanner;

public class CompareOperationExampleScanner2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean play =true;
		
	while(play) {	
		System.out.println("Ȯ���� ���ڸ� �Է��ϼ���.>");
		
		char c = scanner.next().charAt(0);//��ĳ�ʷ� �Էµ� ���ڿ� �� ù��° �����ϳ�����.
		
		if(c>='A' & c<='Z') {
			System.out.println("�빮���Դϴ�.");
		}else if(c>='a' & c<='z') { 
			System.out.println("�ҹ����Դϴ�.");
		}else if(c>='0' & c<='9') {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("��Ÿ�����Դϴ�.");
		}
		
	   System.out.println("����ұ��?");
	   String yesNo=scanner.next();
	   //�񱳿��� �⺻Ÿ�Կ��� ����Ͽ� �� ���Ҽ�����.
	   //if(yesNo=='n' || yesNo=='N') play=!play;
	   //����Ÿ���� �񱳿����ڷ� ���� �Ұ�
	   // ����.equals(��) <- ������ ���� �񱳴���� ������ ���ϴ� �޼ҵ�
	   if(yesNo.equals("n") || yesNo.equals("N")) play=!play;
	   
	}//while�� ��.	
		System.out.println("����");
	}
}
