package com.ajh.s1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("Test3 Start");
		// 쇼핑몰의 총 주문금액 입력
		// 총 주문금액이 30000 이하면 배송비가 3000이 추가, 이상이면 배송비 0

		// 총 주문금액 출력

		Scanner sc = new Scanner(System.in);

		System.out.println("주문금액을 입력하세요.");

		int price = sc.nextInt();

		if (price <= 30000) {

			price = price + 3000;
		}

		System.out.println("총 주문금액은 " + price + "입니다.");

		System.out.println("Test3 Finish");
	}

}
