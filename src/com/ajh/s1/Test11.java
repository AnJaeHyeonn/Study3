package com.ajh.s1;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		System.out.println("Test11 Start");

		// 국어, 영어, 수학 입력
		// 총점 평균 계산
		// 평균이 90점 이상 > A 출력
		// 평균이 80점 이상 > B 출력
		// 평균이 70점 이상 > C 출력
		// 평균이 60점 이상 > D 출력
		// 그 외 나머지 > F 출력

		Scanner sc = new Scanner(System.in);

		int kor;
		int eng;
		int math;
		int total;
		double avg;

		System.out.println("국어 점수를 입력하세요.");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		math = sc.nextInt();

		total = kor + eng + math;
		avg = total / 3.0;

		if (avg >= 90) {
			System.out.println('A');
		} else if (avg >= 80) {
			System.out.println('B');
		} else if (avg >= 70) {
			System.out.println('C');
		} else if (avg >= 60) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}

		System.out.println("Test11 Finish");
	}

}
