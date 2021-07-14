package com.ajh.s3;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
		System.out.println("WhileTest2 Start");

		int id = 1234;
		int pw = 5678;

		// 1. 로그인
		// id,pw 입력
		// 로그인 판단
		// 2. 종료

		Scanner sc = new Scanner(System.in);
		boolean check = true;

		while (check) {
			System.out.println("1.로그인     2.종료");
			int first = sc.nextInt();

			while (first == 1) {
				System.out.println("id 입력");
				int yid = sc.nextInt();
				System.out.println("pw 입력");
				int ypw = sc.nextInt();
				if (id == yid && pw == ypw) {
					System.out.println("로그인성공");
					check = !check;
					first = 0;
				} else {
					System.out.println("로그인실패");
					System.out.println("1.재로그인     2.종료");
					int second = sc.nextInt();

					if (second == 1) {
						break;
					} else {
						check = !check;
						first = 0;
					}

				}
			}

		}

		System.out.println("WhileTest2 Finish");
	}

}
