package ch04;

import java.util.Scanner;
//id�� "hong", pwd�� "1234"
public class LoginIdPassWordNestedIfExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	int count=1;//���� Ƚ�� ī��Ʈ ���� ����
	while(true)	{//�ݺ�
		System.out.println("id�� �Է��ϼ���:");
		String id = scanner.next();
		
		System.out.println("��й�ȣ�� �Է��ϼ���:");
		String password = scanner.next();
		
		if (!id.equals("hong")) {//�α��� ����
			System.out.println("id�� Ȯ���ϼ���.");
		}else {//�α��ν� ��� Ȯ�� ó�� 
			if(password.equals("1234")) {
				System.out.println(id+"�� ȯ���մϴ�.");
				break;//�α��� �����ùݺ����� ���������� ��ɹ� break;
			}else {
				System.out.println("��й�ȣ�� Ȯ���ϼ���.");
			}
		}
		System.out.println((++count)+"ȸ ����");//���� Ƚ�� ���� 
		if(count==5) {//����Ƚ�� üũ �κ�
			System.out.println("���α׷��� �����մϴ�.");
			break;//�ݺ����� ���������� ��ɹ� break;
		}
	}//while��.
		// ����� ��ĳ�� ��ü �ڿ� ����
		scanner.close();
	}

}
