package ch02;

import java.util.Scanner;

public class ArithmaticOpExample8 {
	static int start,end;
	//Ű����� ���� �� �о� ���̴� ��ü ����
    static Scanner scanner = new Scanner(System.in);
    static boolean play=true;
    
public static void main(String[] args) {
	 while(play) {	
		menu();
		looping();
		isRun();
	 }	
	 System.out.println("����");
}
	
static void menu() {
		System.out.println("����� ���ϴ� ������ �Է��ϼ���(1~100):");
		System.out.println("���ۼ���(1~100):");
		start = scanner.nextInt();
		System.out.println("�������(1~100):");
		end = scanner.nextInt();
	}
	
static void looping() {
		for(int i=start; i<end;i++) {
			String str="";
			if(i/10%3==0 & i>10 ) str="¦";
			if((i%10)%3==0 & (i%10)!=0)str=str+"¦";//"¦¦"
			System.out.println(i+":"+str);
	  }
	}
	
static void isRun() {
	System.out.println("����ұ��?(y/n�� ���ϼ���)");
	char yesNo =scanner.next().charAt(0);//��ĳ�ʷ� �Է¹��� ������ ���� ù��° ���ڸ� ����.
	if(yesNo=='n') play=!play;
	}
}
