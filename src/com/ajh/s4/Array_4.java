package com.ajh.s4;

public class Array_4 {
	public static void main(String[] args) {

		int[] ar1 = new int[3];
		ar1[0] = 1;
		ar1[1] = 2;
		ar1[2] = 3;

		// 4 추가

		int[] ar2 = new int[4];

		for (int i = 0; i < ar2.length; i++) {

			if (i < ar1.length) {

				ar2[i] = ar1[i];
			} else {
				ar2[i] = i + 1; // 임의 값의 조건이 1 커진다고 했을 때의 조건식
			}
		}

		ar1 = ar2;

		for (int i = 0; i < ar1.length; i++) {

			System.out.println(ar1[i]);
		}

	}

}
