package ch04;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//���۰� ���� ��Ȯ���� ���� �� �ַ� ���
		boolean play=true;
		
		while(play) {
			System.out.println("hi");
			System.out.println("����ұ��?");
			if(scanner.next().charAt(0)=='n') {
				break;
			}
		}//while��.
		
		System.out.println("����");

	}

}
