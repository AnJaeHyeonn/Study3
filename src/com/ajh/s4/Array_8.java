package com.ajh.s4;

import java.util.Scanner;

public class Array_8 {
	public static void main(String[] args) {

		int[] ids = { 1324, 4567, 4356, 1258 };
		int[] pws = { 6789, 5437, 1235, 9874 };

		// 1.로그인 2.회원가입 3.종료
		// 회원가입 시 아이디 체크

		Scanner sc = new Scanner(System.in);

		boolean check = true;

		while (check) {
			for (int k = 0; k < ids.length; k++) {
				System.out.println(ids[k] + "   " + pws[k]);
			}

			System.out.println("1.로그인     2.회원가입     3.종료");

			int select = sc.nextInt();

			if (select == 1) {
				boolean loginch = false;
				System.out.println("아이디를 입력하세요.");
				int yid = sc.nextInt();
				System.out.println("비밀번호를 입력하세요.");
				int ypw = sc.nextInt();

				for (int i = 0; i < ids.length; i++) {
					if (yid == ids[i] && ypw == pws[i]) {
						loginch = true;

					}
				}

				if (loginch == true) {
					System.out.println("로그인 성공");
					System.out.println("1.로그아웃     2.회원탈퇴     3.종료");
					int select2 = sc.nextInt();
					int index = 0;
					if (select2 == 1) {
					} else if (select2 == 2) {

						int[] nnids = new int[ids.length - 1];

						for (int i = 0; i < ids.length; i++) {
							if (yid == ids[i] && ypw == pws[i]) {
								index = i;
							}
						}

						for (int n = 0; n < ids.length - 1; n++) {
							if (index > n) {
								nnids[n] = ids[n];
							} else if (index <= n) {
								nnids[n] = ids[n + 1];
							}
						}
						ids = nnids;

					} else {
						check = !check;
					}
				} else {
					System.out.println("로그인 실패");
				}

			} else if (select == 2) {

				boolean flag = false;
				System.out.println("아이디를 입력하세요.");
				int newid = sc.nextInt();
				System.out.println("비밀번호를 입력하세요.");
				int newpw = sc.nextInt();
				int[] nids = new int[ids.length + 1];
				int[] npws = new int[pws.length + 1];

				for (int i = 0; i < ids.length; i++) {
					if (newid == ids[i]) {
						System.out.println("중복된 아이디입니다.");
						flag = false;
						break;
					} else {
						flag = true;
					}
				}

				if (flag == true) {
					for (int i = 0; i < ids.length; i++) {
						nids[i] = ids[i];
						npws[i] = pws[i];
					}
					nids[ids.length] = newid;
					npws[pws.length] = newpw;

					ids = nids;
					pws = npws;

					System.out.println("회원가입 성공");
				}

			} else {
				check = !check;

			}

		}
		System.out.println("종료");
	}

}
