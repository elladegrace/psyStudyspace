package ch03;

public class Member {

	// 속성
	int sno;// 회원번호
	String name;// 회원명
	String jumin;// 주민번호

	//
	void getInfo(int grade) {
		if (getGrade(grade) == 1) {
			System.out.println(sno + "," + name + "," + jumin);
		} else {
			System.out.println(sno);
		}
	}

	// 기능부분
	int getGrade(int grade) {
		return grade;
	}

}
