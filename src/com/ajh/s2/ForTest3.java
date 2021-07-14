package com.ajh.s2;

import java.util.Scanner;

public class ForTest3 {
	public static void main(String[] args) {
		System.out.println("ForTest3 Start");

		// 종료 시간을 입력 받기

		Scanner sc = new Scanner(System.in);

		System.out.println("종료 시간을 입력하세요.");
		int end = sc.nextInt();

		for (int sec = 0; sec < 60; sec++) {
			System.out.println(sec + "초");
			if (sec == end) {
				sec = 60;
			}
		}

		System.out.println("ForTest3 Finish");
	}

}
