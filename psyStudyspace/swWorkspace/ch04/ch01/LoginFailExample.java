package ch01;

import java.util.Scanner;

public class LoginFailExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("id�� �Է��ϼ���:");
		String id = scanner.next();
		if(!id.equals("hong")) {
			System.out.println("id�� Ȯ���ϼ���.");
		}
		
		//����� ��ĳ�� ��ü �ڿ� ����
		scanner.close();
	}
}
