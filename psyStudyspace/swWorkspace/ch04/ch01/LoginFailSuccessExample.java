package ch01;

import java.util.Scanner;

public class LoginFailSuccessExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("id�� �Է��ϼ���:");
		String id = scanner.next();
		if (!id.equals("hong")) {
			System.out.println("id�� Ȯ���ϼ���.");
		}else {
			System.out.println(id+"�� ȯ���մϴ�.");
		}

		// ����� ��ĳ�� ��ü �ڿ� ����
		scanner.close();

	}

}
