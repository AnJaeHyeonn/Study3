package com.ajh.s4;

import java.util.Scanner;

public class Array_5 {
	public static void main(String[] args) {

		// 1.정보출력 2.정보추가 3.정보삭제 4. 종료

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int[] ar = { 0, 1, 2 };

		while (flag) {
			System.out.println("1.정보출력     2.정보추가     3.정보삭제     4.검색삭제     5.종료");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("정보를 출력합니다.");
				for (int j = 0; j < ar.length; j++) {
					System.out.println(ar[j]);
				}

				if (ar.length == 0) {
					System.out.println("출력 할 정보가 없습니다.");
				}

				break;
			case 2:
				System.out.println("정보를 추가합니다.");
				System.out.println("추가 할 정보를 입력하세요.");
				int j = sc.nextInt();

				int[] ar1 = new int[ar.length + 1];
				for (int k = 0; k < ar.length; k++) {
					ar1[k] = ar[k];
				}
				ar1[ar.length] = j;

				ar = ar1;

				break;
			case 3:
				System.out.println("정보를 삭제합니다.");
				int[] ar2 = new int[ar.length - 1];
				for (int l = 0; l < ar.length - 1; l++) {

					ar2[l] = ar[l];

				}
				ar = ar2;

				break;
			case 4:
				if (ar.length == 0) {
					System.out.println("삭제 할 정보가 없습니다.");
					break;
				}
				System.out.println("삭제할 인덱스 번호 입력");
				int index = sc.nextInt();

				int[] ar3 = new int[ar.length - 1];

				if (index > ar.length) {

					System.out.println("인덱스를 잘못입력했습니다.");
				} else {

					for (int n = 0; n < ar.length - 1; n++) {
						if (index > n) {

							ar3[n] = ar[n];
						} else if (index <= n) {
							ar3[n] = ar[n + 1];
						}
					}
					ar = ar3;
				}
				break;

			default:
				flag = false;
				break;
			}

		}

		System.out.println("종료합니다.");

	}

}
