package verify.ch20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금| 4. 출금| 5.종료");
			System.out.println("----------------------------------------------------");
			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	// 계좌생성하기
	private static void createAccount() {
		// 계좌번호 입력
		System.out.println("계좌번호>");
		String ano=scanner.next();
		// 소유자 입력
		System.out.println("소유자>");
		String owner=scanner.next();
		// 초기 금액 입력
		System.out.println("입금액>");
		int balance=scanner.nextInt();
		// Account객체 생성
		Account acc = new Account(ano, owner, balance);
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=acc;
				break;
			}
		}
	}
	// 계좌목록보기
	private static void accountList() {
		// 작성위치
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				Account acc = accountArray[i];
				System.out.println(acc.getAno()+","+acc.getOwner()+","+acc.getBalance());
			}
		}
	}
	// 예금하기
	private static void deposit() {
		// 계좌번호 찾기
		System.out.println("계좌번호");
		String ano=scanner.next();
		// 입금액
		System.out.println("입금액");
		int balance=scanner.nextInt();
		
		Account acc = findAccount(ano);
		if(acc!=null) {
			acc.setBalance(acc.getBalance()+balance);
		}else {
			System.out.println("해당 계좌번호가 없습니다.");
		}
		// 작성위치
	}
	// 출금하기
	private static void withdraw() {
		// 계좌번호 찾기
			System.out.println("계좌번호");
			String ano=scanner.next();
			// 입금액
			System.out.println("입금액");
			int balance=scanner.nextInt();
				
			Account acc = findAccount(ano);
			if(acc!=null) {
				if(acc.getBalance()-balance<0) {
					System.out.println("출금액이 잔고보다 많습니다.");
					return;
				}
				acc.setBalance(acc.getBalance()-balance);
			}else {
				System.out.println("해당 계좌번호가 없습니다.");
			}
	}
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				Account acc = accountArray[i];
				if(acc.getAno().equals(ano)) return acc;
			}
		}
		// 작성위치
		return null;
	}
}
