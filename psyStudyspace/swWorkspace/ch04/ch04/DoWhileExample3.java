package ch04;

import java.util.Scanner;

public class DoWhileExample3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//���۰� ���� ��Ȯ���� ���� �� �ַ� ���
		boolean play=false;
		
		//do~while���� ó������ ������ false�� 1ȸ�� �ݵ�� �����.
		do{
			System.out.println("hi");
			System.out.println("����ұ��?");
			if(scanner.next().charAt(0)=='n') {
				break;
			}
		}while(play);
		//while��.
		
		System.out.println("����");

	}

}
