package com.ajh.s1;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("Test5 Start");

		Scanner sc = new Scanner(System.in);

		// 회원가입 시 입력한 ID
		int id = 1234;

		// 회원가입 시 입력한 PW
		int pw = 5678;
		
		//입력할 ID
		int yid =0;
		
		//입력할 PW
		int ypw = 0;

		System.out.println("ID를 입력하세요.");
		// ID 입력 후 저장
		yid = sc.nextInt();

		System.out.println("PW를 입력하세요.");
		// PW 입력 후 저장
		ypw = sc.nextInt();

		if (id == yid && pw == ypw) {
			System.out.println("로그인 성공");
		}

		System.out.println("Test5 Finish");
	}

}
