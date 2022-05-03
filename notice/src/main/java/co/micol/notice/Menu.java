package co.micol.notice;

import java.util.Scanner;

import co.micol.notice.managerment.Notice;
import co.micol.notice.managerment.Student;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private Notice notice = new Notice();
	private Student student = new Student();

	private void mainTitle() {
		System.out.println("===================");
		System.out.println("=====1. 학생조회=====");
		System.out.println("=====2. 공지사항=====");
		System.out.println("=====3. 종   료=====");
		System.out.println("===================");
	}

	private void studentTitle() {

		System.out.println("===================");
		System.out.println("===1. 전체 학생목록===");
		System.out.println("===2. 학생   조회====");
		System.out.println("===3. 학생   등록====");
		System.out.println("===4. 학생   수정====");
		System.out.println("===5. 학생정보삭제====");
		System.out.println("===6. 메인메뉴가기====");
		System.out.println("===================");
	}

	private void noticeTitle() {

		System.out.println("===================");
		System.out.println("===1. 공지사항목록====");
		System.out.println("===2. 공지사항조회====");
		System.out.println("===3. 공지사항등록====");
		System.out.println("===4. 공지사항수정====");
		System.out.println("===5. 공지사항삭제====");
		System.out.println("===6. 메인메뉴가기====");
		System.out.println("===================");
	}

	private void mainMenu() {
		boolean b = false;
		do {
			mainTitle();
			System.out.println("원하는 작업을 선택하세요.");
			int job = sc.nextInt();
			switch (job) {
			case 1:
				studentMenu();
				break;
			case 2:
				noticeMenu();
				break;
			case 3:
				b = true;
				System.out.println("시스템 종료");
				break;

			}
		} while (!b);
	}

	private void studentMenu() {
		boolean b = false;
		do {
			studentTitle();
			System.out.println("원하는 작업을 선택하세요.");
			int job = sc.nextInt();
			switch (job) {
			case 1:
				
				break;
				
			case 2:

				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				b = true;
				break;

			}
		} while (!b);

	}
	private void noticeMenu() {
		boolean b = false;
		do {
			noticeTitle();
			System.out.println("원하는 작업을 선택하세요.");
			int job = sc.nextInt();
			switch (job) {
			case 1:
				notice.noticeList();
				break;
				
			case 2:
				notice.noticeSelect();
				break;
				
			case 3:
				sc.nextLine();
				notice.noticeInsert();
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				b = true;
				break;

			}
		} while (!b);

	}
	public void run() {
		mainMenu();
	}

}