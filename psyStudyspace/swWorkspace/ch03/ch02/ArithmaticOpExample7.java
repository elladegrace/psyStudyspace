package ch02;

import java.util.Scanner;

public class ArithmaticOpExample7 {
	public static void main(String[] args) {
		//Ű����� ���� �� �о� ���̴� ��ü ����
		Scanner scanner = new Scanner(System.in);
		boolean play=true;
		
	 while(play) {	
		System.out.println("����� ���ϴ� ������ �Է��ϼ���(1~100):");
		System.out.println("���ۼ���(1~100):");
		int start = scanner.nextInt();
		System.out.println("�������(1~100):");
		int end = scanner.nextInt();
		
		for(int i=start; i<end;i++) {
			String str="";
			if(i/10%3==0 & i>10 ) str="¦";
			if((i%10)%3==0 & (i%10)!=0)str=str+"¦";//"¦¦"
			System.out.println(i+":"+str);
		}
		
		System.out.println("����ұ��?(y/n�� ���ϼ���)");
		char yesNo =scanner.next().charAt(0);//��ĳ�ʷ� �Է¹��� ������ ���� ù��° ���ڸ� ����.
		if(yesNo=='n') play=!play;
	 }	
	 System.out.println("����");
	}
}
