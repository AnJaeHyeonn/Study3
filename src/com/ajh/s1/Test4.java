package com.ajh.s1;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("Test4 Start");
		// 10대 유무 판별
		// 20살 미만

		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력하세요.");

		int age = sc.nextInt();

		if (age >= 10 && age < 20) {
			System.out.println("10대 입니다.");
		}

/*
		if (age < 20) {
		 
			if (age >= 10) {
		 
			System.out.println("10대 입니다.");
		 
			}
		
		}
*/
		System.out.println("Test4 Finish");
	}

}
