package com.ajh.s2;

import java.util.Scanner;

public class ForTest6 {
	public static void main(String[] args) {
		System.out.println("ForTest6 Start");

		int id = 1234;
		int pw = 5678;

		boolean flag = false;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("ID를 입력하세요.");
			int yid = sc.nextInt();
			System.out.println("PW를 입력하세요.");
			int ypw = sc.nextInt();

			System.out.println("잘못된 정보입니다.");
			System.out.println("================================");
		} // for 끝

		if (flag) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("로그인 실패 은행에 방문");
		}
		System.out.println("ForTest6 Finish");

	}
}
