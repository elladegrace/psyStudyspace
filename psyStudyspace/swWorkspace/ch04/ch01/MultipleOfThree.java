package ch01;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("���� �Է��ϼ���:");
	 int number = scanner.nextInt();
	 
	 //if���ǹ� ������ ��ɹ��� �ϳ��� {}��������.
	 if(number%3==0)
		 System.out.println("3�� ���");
	 else
		 System.out.println("3�� ����� �ƴ�");
	 

	 scanner.close();
	}
}
