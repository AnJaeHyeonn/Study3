package com.ajh.s2;

import java.util.Scanner;

public class ForTest8 {
	public static void main(String[] args) {
		System.out.println("ForTest8 Start");

		Scanner sc = new Scanner(System.in);

		boolean flag = false;

		System.out.println("분 입력");
		int min2 = sc.nextInt();
		System.out.println("초 입력");
		int sec2 = sc.nextInt();

		for (int min = 0; min < 60; min++) {
			for (int sec = 0; sec < 60; sec++) {
				System.out.println(min + "분 " + sec + "초");
				if (min == min2 && sec == sec2) {
					System.out.println("종료");
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}

		}

		System.out.println("ForTest8 Finish");
	}

}
