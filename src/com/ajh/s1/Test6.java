package com.ajh.s1;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("Test6 Start");

/*
		int num = 4;

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
*/
		
		//kor, eng, math입력
		//총점, 평균 계산
		//평균이 60점 이상이면 합격, 아니면 불합격 출력
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요.");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total/3.0;

		/*
		if(avg >= 60) {
			System.out.println("평균 점수는 "+avg+"점으로 합격입니다.");
		} else {
			System.out.println("평균 점수는 "+avg+"점으로 불합격입니다.");
		}
		
		 */
		
		String result = "불합격";
		
		if(avg >=60) {
			result = "합격";
		}
		
		System.out.println(result);
		
		System.out.println("Test6 Finish");
	}
}
