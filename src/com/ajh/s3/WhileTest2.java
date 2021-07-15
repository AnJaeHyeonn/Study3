package com.ajh.s3;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
		System.out.println("WhileTest2 Start");

		int id = 1234;
		int pw = 5678;
		int yid = 0;
		int ypw = 0;
		int level = 1;
		int mon = 0;
		int gold = 0;

		// 1. 로그인
		// id,pw 입력
		// 로그인 판단
		// 2. 종료

		// 로그인성공, 로그인 안됐거나
		// 로그인이 성공했으면 게임 rpg 게임 시작
		// 최초레벨은 1, 만렙 15
		// 최초 gold는 0
		// 레벨 5 달성 시 1000골드 지급
		// 레벨 10 달성 시 2000골드 지급
		// 레벨 15 달성 시 3000 골드 지급

		// 모든몬스터의 경험치는 동일
		// 레벨 1>2 : 3마리
		// 몬스터 1마리 사냥
		// 몬스터 2마리 사냥
		// 몬스터 3마리 사냥
		// 레벨업

		// 레벨 2>3 : 6마리
		// 레벨 3>4 : 9마리
		// ...
		// 레벨14>15 : 42마리
		// 최종 레벨 출력

		Scanner sc = new Scanner(System.in);
		boolean check = true;

		while (check) {
			System.out.println("1.로그인 2.종료");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("id 입력");
				yid = sc.nextInt();
				System.out.println("pw 입력");
				ypw = sc.nextInt();
				if (id == yid && pw == ypw) {
					System.out.println("로그인성공");
					break;
				} else {
					System.out.println("id와 pw를 다시 확인");
				}
			} else {
				check = !check;
				System.out.println("종료");
			}

		}

		if (check) {
			System.out.println("게임을 시작합니다.");

			for (level = 1; level < 15; level++) {

				if (level % 5 == 0) {
					gold = gold + (level / 5 * 1000);
					System.out.println(level / 5 * 1000 + " gold 지급");

				}
				System.out.println("현재레벌 : " + level);
				for (mon = 0; mon < level * 3; mon++) {
					System.out.println(mon + 1 + " 마리 사냥 성공");
				}
				System.out.println("========== 축 레벨 업 ==========");

			}
			System.out.println("최종 레벨 : " + level);
			gold = gold + level / 5 * 1000;
			System.out.println("최종 골드 : " + gold);
		}

		System.out.println("WhileTest2 Finish");
	}

}
