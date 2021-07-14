package com.ajh.s2;

import java.util.Scanner;

public class ForTest5 {
	public static void main(String[] args) {
		System.out.println("ForTest5 Start");

		// 과목 수 입력
		// 과목 수 만큼 점수 입력

		Scanner sc = new Scanner(System.in);
		int i = 0; // 과목 수
		int k = 0; // 과목 점수
		int total = 0; // 총점
		double avg = 0; // 평균

		System.out.println("과목 수를 입력하세요.");
		i = sc.nextInt(); // 과목 입력

		for (int j = 0; j < i; j++) {

			System.out.println(j+1+"번째 점수 입력");

			k = sc.nextInt(); // 과목 점수 입력
			total = total + k; // 총점 연산
		}

		avg = (double) (total / i); // 평균 연산

		System.out.println(avg);

		System.out.println("ForTest5 Finish");
	}

}
