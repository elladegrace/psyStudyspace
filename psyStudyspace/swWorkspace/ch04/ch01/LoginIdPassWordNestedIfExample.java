package ch01;

import java.util.Scanner;
//id�� "hong", pwd�� "1234"
public class LoginIdPassWordNestedIfExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("id�� �Է��ϼ���:");
		String id = scanner.next();
		
		System.out.println("��й�ȣ�� �Է��ϼ���:");
		String password = scanner.next();
		
		if (!id.equals("hong")) {//�α��� ����
			System.out.println("id�� Ȯ���ϼ���.");
		}else {//�α��ν� ��� Ȯ�� ó�� 
			if(password.equals("1234")) {
				System.out.println(id+"�� ȯ���մϴ�.");
			}else {
				System.out.println("��й�ȣ�� Ȯ���ϼ���.");	
			}
		}

		// ����� ��ĳ�� ��ü �ڿ� ����
		scanner.close();


	}

}
