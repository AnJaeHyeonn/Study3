package com.ajh.s2;

import java.util.Scanner;

public class ForTest9 {

	public static void main(String[] args) {
		System.out.println("ForTest9 Start");

		// FPS
		// 탄창 3개
		// 한 탄창에 30발
		// 단발모드 > 1발씩
		// 점사모드 > 3발씩

		Scanner sc = new Scanner(System.in);

		for (int tan = 0; tan < 3; tan++) {
			System.out.println("단발모드는 1번, 점사모드는 2번을 눌러주세요.");
			int select = sc.nextInt();
			String sound = "탕";
			// int count = 30;
			int num = 1;
			if (select != 1) {
				sound = "타타탕";
				// count = 10;
				num = 3;
			}

			for (int i = 0; i < 30; i = i + num) {
				System.out.println(sound);
			}

		}

		System.out.println("ForTest9 Finish");

	}

}
