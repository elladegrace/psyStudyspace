package verify.ch20.ch03;

import java.util.Scanner;

public class MemberApplication {
    private static Member[] memberArray = new Member[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            printMenu();
            int selectNo = Scanner.nextInt();
            if(selectNo==1){
                createMember();
            }else if(selectNo==2){
                memberList();
            }else if(selectNo==3){
                deposit();
            }else if(selectNo==4){
                withdraw();
            }else if(selectNo==5){
                run=false;
            }
        }
        System.out.println("프로그램 종료");
        }
        // 맴버 생성하기

        // 맴버 리스트 보기

        // 포인트 적립하기

        // 포인트 차감하기

    }
    // 메인
    static void printMenu(){
        System.out.println("------------------------------------------------------------------");
		System.out.println("  1.회원생성  |  2.회원목록  |  3.포인트 적립  |  4. 포인트 차감  | 5.종료 ");
		System.out.println("------------------------------------------------------------------");
    }
}
