package ch02;

import java.util.Scanner;

public class ArithmaticOpExample6 {
	public static void main(String[] args) {
		//Ű����� ���� �� �о� ���̴� ��ü ����
		Scanner scanner = new Scanner(System.in);
		int inputNumber;
		boolean play=true;
		
	 while(play) {	
		System.out.println("����� ���ϴ� ������ �Է��ϼ���(1~100):");
		inputNumber = scanner.nextInt();
		
		String str="";
		if(inputNumber/10%3==0 & inputNumber>10 ) str="¦";
		if((inputNumber%10)%3==0 & (inputNumber%10)!=0)str=str+"¦";//"¦¦"
		System.out.println(inputNumber+":"+str);
		
		System.out.println("����ұ��?(y/n�� ���ϼ���)");
		char yesNo =scanner.next().charAt(0);//��ĳ�ʷ� �Է¹��� ������ ���� ù��° ���ڸ� ����.
		if(yesNo=='n') play=!play;
	 }	
	 System.out.println("����");
	 

	}

}
