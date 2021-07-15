package com.ajh.s4;

import java.util.Scanner;

public class Array_1 {
	public static void main(String[] args) {
		// 11, 20, 32
		// int
		int num1 = 11;
		int num2 = 20;
		num2 = 30;

		// 모을려고하는데이터타입 [ ] 변수명 = new 모을려고하는데이터타입 [갯수];

		int[] numbers = new int[3];
		// numbers의 데이터 타입 : int[]
		System.out.println(numbers);

		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;

		System.out.println("배열의 크기 : " + numbers.length);

//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);

		// 3.12 2.3 4.123 5.0 담는 배열 선언하고 데이터 대입

		double[] n2 = new double[4];
		n2[0] = 3.12;
		n2[1] = 2.3;
		n2[2] = 4.123;
		n2[3] = 5.0;
		System.out.println("배열읰 크기 : " + n2.length);
		System.out.println(n2[0]);
		System.out.println(n2[1]);
		System.out.println(n2[2]);
		System.out.println(n2[3]);

		// 문자열을 담을 배열 3칸짜리 생성
		// 모두 출력

		String[] names = new String[3];
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

		Scanner[] scs = new Scanner[2];

		System.out.println(scs[0]);
		System.out.println(scs[1]);

	}

}
